package test.usecasevendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.example.joyeria.usecasevvendedor.CrearVendedorUseCase;
import org.example.joyeria.vendedor.events.VendedorCreado;
import org.example.joyeria.vendedor.values.Nombre;
import org.example.joyeria.vendedor.values.VendedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.example.joyeria.vendedor.commands.CrearVendedor;

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
