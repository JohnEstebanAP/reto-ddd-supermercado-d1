package org.sofka.ddd.usecaseEmpleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.Empleado.Empleado;
import org.sofka.ddd.Empleado.commands.CrearEmpleado;

public class CrearEmpleadoUseCase extends UseCase<RequestCommand<CrearEmpleado>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearEmpleado> crearEmpleadoRequestCommand) {
        var command = crearEmpleadoRequestCommand.getCommand();
        var empleado = new Empleado(
                command.entityId(),
                command.nombreEmpleado(),
                command.telefonoEmpleado(),
                command.permisos(),
                command.documento(),
                command.tipoDeEmpleado()
        );
        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
    }
}
