package org.sofka.ddd.usecasefactura;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.factura.Factura;
import org.sofka.ddd.factura.commands.AgregarFactura;

public class CrearFacturaUseCase extends UseCase<RequestCommand<AgregarFactura>, ResponseEvents> {
  @Override
  public void executeUseCase(RequestCommand<AgregarFactura> AgregarFacturaRequest) {
  /*  var command = AgregarFacturaRequest.getCommand();
    var factura = new Factura(
            command.getEntityId(),
            command.getClienteId());
    emit().onResponse(new ResponseEvents(factura.getUncommittedChanges()));*/
  }
}
