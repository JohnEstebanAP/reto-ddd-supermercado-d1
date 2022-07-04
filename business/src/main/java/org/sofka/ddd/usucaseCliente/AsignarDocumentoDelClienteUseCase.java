package org.sofka.ddd.usucaseCliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import org.sofka.ddd.cliente.Cliente;
import org.sofka.ddd.cliente.commands.AsignarDocumentoDelCliente;
import org.sofka.ddd.cliente.events.DocumentoDelClienteAsignado;
import org.sofka.ddd.cliente.values.ids.ClienteId;

public class AsignarDocumentoDelClienteUseCase
    extends UseCase<TriggeredEvent<DocumentoDelClienteAsignado>, ResponseEvents> {

  @Override
  public void executeUseCase(
      TriggeredEvent<DocumentoDelClienteAsignado> documentoDelClienteAsignadoTriggeredEvent) {

    var event = documentoDelClienteAsignadoTriggeredEvent.getDomainEvent();
    var cliente = Cliente.from(ClienteId.of(event.aggregateRootId()), retrieveEvents());

    cliente.asignarDocumentodelCliente(event.documento());

    emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
  }
}
