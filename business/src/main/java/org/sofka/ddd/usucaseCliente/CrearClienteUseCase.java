package org.sofka.ddd.usucaseCliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.cliente.Cliente;
import org.sofka.ddd.cliente.commands.CrearCliente;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.empleado.Empleado;
import org.sofka.ddd.empleado.commands.CrearEmpleado;

public class CrearClienteUseCase extends UseCase<RequestCommand<CrearCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCliente> crearClienteRequestCommand) {
        var command = crearClienteRequestCommand.getCommand();
        var cliente = new Cliente(
                command.entityId(),
                command.nombreCliente(),
                command.documento(),
                command.medioDePago(),
                command.direccionCliente()
        );
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
