package org.sofka.ddd.usecaseEmpleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.empleado.Empleado;
import org.sofka.ddd.empleado.commands.AsignarPermiso;

public class AsignarPermisoUseCase extends UseCase<RequestCommand<AsignarPermiso>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsignarPermiso> asignarPermisoRequestCommand) {
        var command = asignarPermisoRequestCommand.getCommand();
        var empleado = Empleado.from(command.entityId(), retrieveEvents());

        empleado.asignarPermiso(command.permiso());

        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
    }
}
