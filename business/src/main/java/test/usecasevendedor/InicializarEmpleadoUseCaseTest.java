package test.usecasevendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.empleado.commands.InicializarEmpleado;
import org.sofka.ddd.empleado.events.EmpleadoInicializado;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.usecaseEmpleado.InicializarEmpleadoUseCase;

@ExtendWith(MockitoExtension.class)
public class InicializarEmpleadoUseCaseTest {

  @Mock
  private DomainEventRepository repository;

  @Test
  public void cuandoSeInicializaUnEmpleado() {
    // arrange
    EmpleadoId empleadoId = EmpleadoId.of("111111");
    var command = new InicializarEmpleado(empleadoId);
    var useCase = new InicializarEmpleadoUseCase();

    //when(repository.getEventsBy(empleadoId.value())).thenReturn(null);
    useCase.addRepository(repository);

    // act
    var events =
        UseCaseHandler.getInstance()
            .setIdentifyExecutor(empleadoId.value())
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var empleadoInicializado = (EmpleadoInicializado) events.get(0);
    Assertions.assertEquals("111111", empleadoInicializado.entityId().value());
  }
}
