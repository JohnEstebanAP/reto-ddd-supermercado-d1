package org.sofka.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.values.TipoDePago;
import org.sofka.ddd.cliente.values.ids.ClienteId;

public class ActualizarTipoDePago extends Command {

  private final ClienteId clienteId;
  private final MedioDePago medioDePago;
  private final TipoDePago tipoDePago;

  public ActualizarTipoDePago(ClienteId clienteId, MedioDePago medioDePago, TipoDePago tipoDePago) {
    this.clienteId = clienteId;
    this.medioDePago = medioDePago;
    this.tipoDePago = tipoDePago;
  }

  public ClienteId clienteId() {
    return clienteId;
  }

  public MedioDePago medioDePago() {
    return medioDePago;
  }

  public TipoDePago tipoDePago() {
    return tipoDePago;
  }
}
