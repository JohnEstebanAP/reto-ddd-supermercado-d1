package org.sofka.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.values.MontoDeDinero;
import org.sofka.ddd.cliente.values.ids.ClienteId;


public class ActualizarMontoDeDinero extends Command{

  private final ClienteId clienteId;
  private final MedioDePago medioDePago;
  private final MontoDeDinero montoDeDinero;
  public ActualizarMontoDeDinero(ClienteId clienteId, MedioDePago medioDePago, MontoDeDinero montoDeDinero){
    this.clienteId = clienteId;
    this.medioDePago = medioDePago;
    this.montoDeDinero = montoDeDinero;
  }

  public ClienteId clienteId() {
    return clienteId;
  }

  public MedioDePago medioDePago() {
    return medioDePago;
  }

  public MontoDeDinero montoDeDinero() {
    return montoDeDinero;
  }
}
