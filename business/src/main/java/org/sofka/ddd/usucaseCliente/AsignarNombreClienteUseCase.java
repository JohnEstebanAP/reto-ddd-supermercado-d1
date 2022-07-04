package org.sofka.ddd.usucaseCliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import org.sofka.ddd.cliente.Cliente;
import org.sofka.ddd.cliente.events.NombreClienteAsignado;
import org.sofka.ddd.cliente.values.ids.ClienteId;

public class AsignarNombreClienteUseCase
    extends UseCase<TriggeredEvent<NombreClienteAsignado>, ResponseEvents> {

  @Override
  public void executeUseCase(
      TriggeredEvent<NombreClienteAsignado> nombreClienteAsignadoTriggeredEvent) {

    var event = nombreClienteAsignadoTriggeredEvent.getDomainEvent();
    var cliente = Cliente.from(ClienteId.of(event.aggregateRootId()), retrieveEvents());

    cliente.asignarNombreCliente(event.nombreCliente());

    emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
  }
}
