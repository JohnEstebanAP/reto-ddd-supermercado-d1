package org.sofka.ddd.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.Direccion;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.events.ClienteCreado;
import org.sofka.ddd.cliente.events.DocumentoDelClienteAsignado;
import org.sofka.ddd.cliente.events.NombreClienteActualizado;
import org.sofka.ddd.cliente.events.NombreClienteAsignado;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.cliente.values.NombreCliente;

import java.util.List;
import java.util.Objects;


public class Cliente extends AggregateEvent<ClienteId> {

  protected NombreCliente nombreCliente;
  protected Documento documento;
  protected MedioDePago medioDePago;
  protected Direccion direccionCliente;

  public Cliente(ClienteId entityId,NombreCliente nombreCliente, Documento documento, MedioDePago medioDePago, Direccion direccionCliente) {
    super(entityId);
    this.nombreCliente = nombreCliente;
    this.documento = documento;
    this.medioDePago = medioDePago;
    this.direccionCliente = direccionCliente;

    appendChange(new ClienteCreado(entityId, nombreCliente, documento, medioDePago, direccionCliente)).apply();
  }

  private Cliente(ClienteId entityId) {
    super(entityId);
    subscribe(new ClienteChange(this));
  }

  public void crearCliente(ClienteId entityId){
    this.entityId = entityId;
  }

  public static Cliente from(ClienteId clienteId, List<DomainEvent> events) {
    var cliente = new Cliente(clienteId);
    events.forEach(cliente::applyEvent);
    return cliente;
  }

  public void asignarNombreCliente(NombreCliente nombre) {
    Objects.requireNonNull(nombre);
    appendChange(new NombreClienteAsignado(nombre)).apply();
  }

  public void actualizarNombreCliento(NombreCliente nombre) {
    Objects.requireNonNull(nombre);
    appendChange(new NombreClienteActualizado(nombre)).apply();
  }

  public void asignarDocumentodelCliente(Documento documento) {
    Objects.requireNonNull(documento);
    appendChange(new DocumentoDelClienteAsignado(documento)).apply();
  }
}
