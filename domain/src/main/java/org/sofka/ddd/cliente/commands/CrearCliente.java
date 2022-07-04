package org.sofka.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.entitys.Direccion;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.cliente.values.NombreCliente;


public class CrearCliente extends Command {

  private final ClienteId entityId;

  private NombreCliente nombreCliente;
  private Documento documento;
  private MedioDePago medioDePago;
  private Direccion direccionCliente;

  public CrearCliente(
      ClienteId entityId,
      NombreCliente nombreCliente,
      Documento documento,
      MedioDePago medioDePago,
      Direccion direccionCliente) {

    this.entityId = entityId;
    this.nombreCliente = nombreCliente;
    this.documento = documento;
    this.medioDePago = medioDePago;
    this.direccionCliente = direccionCliente;
  }

  public ClienteId entityId() {
    return entityId;
  }

  public NombreCliente nombreCliente() {
    return nombreCliente;
  }

  public Documento documento() {
    return documento;
  }

  public MedioDePago medioDePago() {
    return medioDePago;
  }

  public Direccion direccionCliente() {
    return direccionCliente;
  }
}
