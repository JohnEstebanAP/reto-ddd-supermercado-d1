package test.usecasevendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.sofka.ddd.usecasevvendedor.CrearVendedorUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.vendedor.commands.CrearVendedor;
import org.sofka.ddd.vendedor.events.VendedorCreado;
import org.sofka.ddd.vendedor.values.Nombre;
import org.sofka.ddd.vendedor.values.VendedorId;

@ExtendWith(MockitoExtension.class)
public class CrearVendedorUseCaseTest {

  @InjectMocks CrearVendedorUseCase useCase;

  @Test
  public void cuandoSeCreaUnVendedor() {
    // arrange
    VendedorId vendedorId = VendedorId.of("111111");
    Nombre nombre = new Nombre("Sebastian");
    var command = new CrearVendedor(vendedorId, nombre);

    // act
    var events =
        UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var event = (VendedorCreado) events.get(0);
    Assertions.assertEquals("Sebastian", event.getNombre().value());
  }
}
