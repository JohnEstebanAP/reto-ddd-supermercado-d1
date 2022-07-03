package test.usecaseproductotest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.producto.EstadoDelProducto;
import org.sofka.ddd.producto.Proveedor;
import org.sofka.ddd.producto.Ubicacion;
import org.sofka.ddd.producto.commands.AgregarProducto;
import org.sofka.ddd.producto.events.ProductoAgregado;
import org.sofka.ddd.producto.values.*;
import org.sofka.ddd.usecaseproducto.AgregarProductoUseCase;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class AgregarProductoUseCaseTest {

  @InjectMocks
  AgregarProductoUseCase useCase;

  @Test
  public void cuandoSeAgregaUnproducto() {

    // arrange
    ProductoId productoId = ProductoId.of("111111");

    UbicacionId ubicacionId = UbicacionId.of("1");
    Estanteria estanteria = new Estanteria("A1");
    Pasillo pasillo = new Pasillo("13");
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

    var command = new AgregarProducto(productoId, ubicacion, proveedor, estadoDelProducto, nombreProducto, nombreMarca, stock, fechaProducto, fechaCaducidad, fechaIngreso, precio );

    // act
    var events =
            UseCaseHandler.getInstance()
                    .syncExecutor(useCase, new RequestCommand<>(command))
                    .orElseThrow()
                    .getDomainEvents();

    // assert
    var event = (ProductoAgregado) events.get(0);
    Assertions.assertEquals("111111", event.productoId().value());
  }
}
