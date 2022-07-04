package org.sofka.ddd.usucaseCliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.cliente.Cliente;
import org.sofka.ddd.cliente.commands.AsignarDocumentoDelCliente;
import org.sofka.ddd.cliente.commands.AsignarNombreCliente;

public class AsignarDocumentoDelClienteUseCase
    extends UseCase<RequestCommand<AsignarDocumentoDelCliente>, ResponseEvents> {

  @Override
  public void executeUseCase(
      RequestCommand<AsignarDocumentoDelCliente> asignarDocumentoDelClienteRequestCommand) {
    var command = asignarDocumentoDelClienteRequestCommand.getCommand();
    var cliente = Cliente.from(command.clienteId(), retrieveEvents());

    cliente.asignarDocumentodelCliente(command.documento());

    emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
  }
}
