package org.sofka.ddd.usecaseEmpleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.empleado.Empleado;
import org.sofka.ddd.empleado.commands.ActualizarNombre;
import org.sofka.ddd.empleado.commands.CrearEmpleado;

public class ActualizarNombreUseCase extends UseCase<RequestCommand<ActualizarNombre>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarNombre> actualizarNombreRequestCommand) {
        var command = actualizarNombreRequestCommand.getCommand();
        var empleado = Empleado.from(command.entityId(), retrieveEvents());

        empleado.actualizarNombre(command.nombre());

        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
    }
}
