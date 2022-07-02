package test.usecasevendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.factura.EstadoFactura;
import org.sofka.ddd.factura.Factura;
import org.sofka.ddd.factura.Transaccion;
import org.sofka.ddd.factura.commands.AgregarFactura;
import org.sofka.ddd.factura.events.FacturaAgregada;
import org.sofka.ddd.factura.values.*;
import org.sofka.ddd.producto.values.ProductoId;
import org.sofka.ddd.usecasefactura.CrearFacturaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class CrearFacturaUseCaseTest {
  @InjectMocks
  CrearFacturaUseCase useCase;

  @Test
  public void cuandoSeCreaUnaFactura() {
    // arrange
    FacturaId facturaId = FacturaId.of("f12");
    Set<ProductoId> productos = new HashSet<>();

    ProductoId producto1 = ProductoId.of("p111111");
    ProductoId producto2 = ProductoId.of("p222222");
    productos.add(producto1);
    productos.add(producto2);

    EmpleadoId empleadoId = EmpleadoId.of("111111");
    ClienteId clienteId = ClienteId.of("1111");

    TransaccionId transaccionId = new TransaccionId("t1");
    TotalPago totalPago = new TotalPago(100000.0);
    Fecha fechaTransaccion = new Fecha(12, 6, 2022);
    Transaccion transaccion = new Transaccion(transaccionId, totalPago, fechaTransaccion);

    EstadoFacturaId estadoFacturaId = EstadoFacturaId.of("factura1");
    Fecha fechaFactura = new Fecha(12, 6, 2022);
    EstadoActual estadoActual = new EstadoActual("Pagado");
    EstadoFactura estadoFactura = new EstadoFactura(estadoFacturaId, fechaFactura, estadoActual );

    var command = new AgregarFactura(facturaId, productos, empleadoId, clienteId, transaccion, estadoFactura);

    // act
    var events =
        UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var event = (FacturaAgregada) events.get(0);
    Assertions.assertEquals("f12", event.facturaId().value());
  }



}
