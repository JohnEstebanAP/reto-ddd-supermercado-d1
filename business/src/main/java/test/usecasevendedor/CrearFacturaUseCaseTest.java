package test.usecasevendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.example.joyeria.factura.events.FacturaAgregada;
import org.example.joyeria.factura.values.ClienteId;
import org.example.joyeria.factura.values.FacturaId;
import org.example.joyeria.usecasefactura.CrearFacturaUseCase;
import org.example.joyeria.factura.commands.AgregarFactura;
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
    var command = new AgregarFactura(facturaId,clienteId);

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
