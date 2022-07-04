package org.sofka.ddd.usucaseCliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.cliente.Cliente;
import org.sofka.ddd.cliente.commands.AsignarNombreCliente;


public class AsignarNombreClienteUseCase extends UseCase<RequestCommand<AsignarNombreCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsignarNombreCliente> asignarNombreClienteRequestCommand) {

        var command = asignarNombreClienteRequestCommand.getCommand();
        var cliente = Cliente.from (command.clienteId(), retrieveEvents());

        cliente.asignarNombreCliente(command.nombreCliente());

        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
