package org.sofka.ddd.usecaseEmpleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.empleado.Empleado;
import org.sofka.ddd.empleado.commands.ActualizarNombre;
import org.sofka.ddd.empleado.commands.CrearTipoDeEmpleado;

public class CrearTipoDeEmpleadoUseCase extends UseCase<RequestCommand<CrearTipoDeEmpleado>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearTipoDeEmpleado> crearTipoDeEmpleadoRequestCommand) {
        var command = crearTipoDeEmpleadoRequestCommand.getCommand();
        var empleado = Empleado.from(command.entityId(), retrieveEvents());

        empleado.crearTipoDeEmpleado(command.tipoDeEmpleado());

        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
    }
}
