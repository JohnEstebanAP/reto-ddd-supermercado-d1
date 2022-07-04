package org.sofka.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.values.ids.ClienteId;


public class AsignarMedioDePago extends Command{


  private final ClienteId clienteId;
  private final MedioDePago medioDePago;

  public AsignarMedioDePago(ClienteId clienteId, MedioDePago medioDePago) {
    this.clienteId = clienteId;
    this.medioDePago = medioDePago;
  }

  public ClienteId clienteId() {
    return clienteId;
  }

  public MedioDePago medioDePago() {
    return medioDePago;
  }
}
