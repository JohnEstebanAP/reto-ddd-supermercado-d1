package org.sofka.ddd.usecaseEmpleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.empleado.Empleado;
import org.sofka.ddd.empleado.commands.ActualizarNombre;
import org.sofka.ddd.empleado.commands.ActualizarTelefono;

public class ActualizarTelefonoUseCase extends UseCase<RequestCommand<ActualizarTelefono>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarTelefono> actualizarTelefonoRequestCommand) {
        var command = actualizarTelefonoRequestCommand.getCommand();
        var empleado = Empleado.from(command.entityId(), retrieveEvents());

        empleado.actualizarTelefono (command.telefonoEmpleado());

        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));

    }
}
