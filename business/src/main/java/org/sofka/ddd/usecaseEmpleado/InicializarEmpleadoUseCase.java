package org.sofka.ddd.usecaseEmpleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.empleado.Empleado;
import org.sofka.ddd.empleado.commands.InicializarEmpleado;

public class InicializarEmpleadoUseCase
    extends UseCase<RequestCommand<InicializarEmpleado>, ResponseEvents> {

  @Override
  public void executeUseCase(
      RequestCommand<InicializarEmpleado> inicializarEmpleadoRequestCommand) {

    var command = inicializarEmpleadoRequestCommand.getCommand();

    var empleado = Empleado.from(command.empleadoId(), retrieveEvents());

    empleado.inicializarEmpleado();
    emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
  }
}
