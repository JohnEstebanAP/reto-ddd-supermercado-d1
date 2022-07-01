package test.usecasevendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.sofka.ddd.factura.commands.AgregarFactura;
import org.sofka.ddd.factura.events.FacturaAgregada;
import org.sofka.ddd.factura.values.ClienteId;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.usecasefactura.CrearFacturaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CrearFacturaUseCaseTest {

  @InjectMocks CrearFacturaUseCase useCase;

  @Test
  public void cuandoSeCreaUnaFactura() {
    // arrange
    FacturaId facturaId = FacturaId.of("1017");
    ClienteId clienteId = ClienteId.of("1017272663");
    var command = new AgregarFactura(facturaId, clienteId);

    // act
    var events =
        UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var event = (FacturaAgregada) events.get(0);
    Assertions.assertEquals("1017", event.getEntityId().value());
  }
}
