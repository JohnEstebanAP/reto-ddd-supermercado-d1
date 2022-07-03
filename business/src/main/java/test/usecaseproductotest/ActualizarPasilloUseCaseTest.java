package test.usecaseproductotest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.producto.EstadoDelProducto;
import org.sofka.ddd.producto.Proveedor;
import org.sofka.ddd.producto.Ubicacion;
import org.sofka.ddd.producto.commands.ActualizarPasillo;
import org.sofka.ddd.producto.events.PasilloActualizado;
import org.sofka.ddd.producto.events.ProductoAgregado;
import org.sofka.ddd.producto.values.*;
import org.sofka.ddd.usecaseproducto.ActualizarPasilloUseCase;

import java.time.LocalDate;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ActualizarPasilloUseCaseTest {

  @InjectMocks
  ActualizarPasilloUseCase useCase;

  @Mock
  private DomainEventRepository repository;

  @Test
  public void cuandoSeActualizaElPasilloDeUnProducto() {

    // arrange
    ProductoId productoId = ProductoId.of("2");

    UbicacionId ubicacionId = UbicacionId.of("1");
    Estanteria estanteria = new Estanteria("12");
    Pasillo pasillo = new Pasillo("A2");
    Ubicacion ubicacion = new Ubicacion(ubicacionId, estanteria, pasillo);

    var command = new ActualizarPasillo(productoId, ubicacion, pasillo);

    Mockito.when(repository.getEventsBy(productoId.value())).thenReturn(historial());
    useCase.addRepository(repository);

    // act
    var events =
            UseCaseHandler.getInstance()
                    .setIdentifyExecutor("2")
                    .syncExecutor(useCase, new RequestCommand<>(command))
                    .orElseThrow()
                    .getDomainEvents();

    // assert
    var event = (PasilloActualizado) events.get(0);
    Assertions.assertEquals("1", event.ubicacion().identity().value());
    Assertions.assertEquals("A2", event.ubicacion().pasillo().value());
    Assertions.assertEquals("12", event.ubicacion().estanteria().value());
  }


  public List<DomainEvent> historial(){
    // arrange
    ProductoId productoId = ProductoId.of("2");

    UbicacionId ubicacionId = UbicacionId.of("1");
    Estanteria estanteria = new Estanteria("12");
    Pasillo pasillo = new Pasillo("A1");
    Ubicacion ubicacion = new Ubicacion(ubicacionId, estanteria, pasillo);

    ProveedorId proveedorId = ProveedorId.of("1017272663");
    TelefonoProveedor telefonoProveedor = new TelefonoProveedor("3215801523");
    NombreProveedor nombreProveedor = new NombreProveedor("John");
    Proveedor proveedor = new Proveedor(proveedorId, telefonoProveedor, nombreProveedor);

    EstadoDelProductoId estadoDelProductoId = EstadoDelProductoId.of("1");
    EstadoProducto  estadoProducto = new EstadoProducto("ALFRENTE");//Alfrente //Promoción //Descuento //
    Caducidad caducidad = new Caducidad("OPTIMO");//Optimo //Proximo a Vencer //Vencido
    EstadoDelProducto estadoDelProducto = new EstadoDelProducto(estadoDelProductoId, estadoProducto, caducidad);

    NombreProducto nombreProducto = new NombreProducto("Oreo");
    NombreMarca nombreMarca = new NombreMarca("Oreo");

    Stock stock = new Stock(200);
    FechaProducto fechaProducto = new FechaProducto(11,6,2022);
    FechaCaducidad fechaCaducidad = new FechaCaducidad(25, 6, 2023);
    LocalDate date= LocalDate.now();
    FechaIngreso fechaIngreso = new FechaIngreso(date);
    Precio precio = new Precio(2500.0);

    var command = new ProductoAgregado(productoId, ubicacion, proveedor, estadoDelProducto, nombreProducto, nombreMarca, stock, fechaProducto, fechaCaducidad, fechaIngreso, precio );

    return List.of(command);
  }
}
