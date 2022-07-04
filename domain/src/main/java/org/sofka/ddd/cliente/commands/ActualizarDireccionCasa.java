package org.sofka.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.entitys.Direccion;
import org.sofka.ddd.cliente.values.DireccionCasa;
import org.sofka.ddd.cliente.values.ids.ClienteId;


public class ActualizarDireccionCasa extends Command {

  private final ClienteId clienteId;
  private final Direccion direccion;
  private final DireccionCasa direccionCasa;

  public ActualizarDireccionCasa(ClienteId clienteId, Direccion direccion, DireccionCasa direccionCasa){
    this.clienteId = clienteId;
    this.direccion = direccion;
    this.direccionCasa = direccionCasa;
  }

  public ClienteId clienteId() {
    return clienteId;
  }

  public Direccion direccion() {
    return direccion;
  }

  public DireccionCasa direccionCasa() {
    return direccionCasa;
  }
}
