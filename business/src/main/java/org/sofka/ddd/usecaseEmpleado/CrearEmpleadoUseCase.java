package org.sofka.ddd.usecaseEmpleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.Empleado.Empleado;
import org.sofka.ddd.Empleado.commands.CrearEmpleado;

public class CrearEmpleadoUseCase extends UseCase<RequestCommand<CrearEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearEmpleado> CrearVendedorRequest) {
        var command = CrearVendedorRequest.getCommand();
        var vendedor = new Empleado(
                command.getEntityId(),
                command.getNombre()
        );
        emit().onResponse(new ResponseEvents(vendedor.getUncommittedChanges()));

    }
}
