package test.usecasevendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.sofka.ddd.usecaseEmpleado.CrearEmpleadoUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.Empleado.commands.CrearEmpleado;
import org.sofka.ddd.Empleado.events.EmpleadoCreado;
import org.sofka.ddd.Empleado.values.NombreEmpleado;
import org.sofka.ddd.Empleado.values.EmpleadoId;

@ExtendWith(MockitoExtension.class)
public class CrearVendedorUseCaseTest {

  @InjectMocks
  CrearEmpleadoUseCase useCase;

  @Test
  public void cuandoSeCreaUnVendedor() {
    // arrange
    EmpleadoId vendedorId = EmpleadoId.of("111111");
    NombreEmpleado nombre = new NombreEmpleado("Sebastian");
    var command = new CrearEmpleado(vendedorId, nombre);

    // act
    var events =
        UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var event = (EmpleadoCreado) events.get(0);
    Assertions.assertEquals("Sebastian", event.getNombre().value());
  }
}
