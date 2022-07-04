package org.sofka.ddd.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.Direccion;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.events.*;
import org.sofka.ddd.cliente.values.*;
import org.sofka.ddd.cliente.values.ids.ClienteId;

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


  public void asignarTipoDeDocumento( Documento documento, TipoDocumento tipoDocumento) {
    Objects.requireNonNull(documento);
    Objects.requireNonNull(tipoDocumento);
    appendChange(new TipoDeDocumentoAsignado(documento, tipoDocumento)).apply();
  }

  public void asignarNumeroDocumento(Documento documento, NumeroDocumento numeroDocumento) {
    Objects.requireNonNull(documento);
    Objects.requireNonNull(numeroDocumento);
    appendChange(new NumeroDocumentoAsignado(documento, numeroDocumento)).apply();
  }

  public void actualizarNumeroDocumento(Documento documento, NumeroDocumento numeroDocumento) {
    Objects.requireNonNull(documento);
    Objects.requireNonNull(numeroDocumento);
    appendChange(new NumeroDocumentoActualizado(documento, numeroDocumento)).apply();
  }

  public void asignarMedioDePago(MedioDePago medioDePago) {
    Objects.requireNonNull(medioDePago);
    appendChange(new MedioDePagoAsignado(medioDePago)).apply();
  }

  public void actualizarTipoDePago(MedioDePago medioDePago, TipoDePago tipoDePago) {
    Objects.requireNonNull(medioDePago);
    Objects.requireNonNull(tipoDePago);
    appendChange(new TipoDePagoActualizado(medioDePago, tipoDePago)).apply();
  }

  public void asignarMontoDeDinero(MedioDePago medioDePago, MontoDeDinero montoDeDinero) {
    Objects.requireNonNull(medioDePago);
    Objects.requireNonNull(montoDeDinero);
    appendChange(new MontoDeDineroAsignado(medioDePago, montoDeDinero)).apply();
  }

  public void actualizarMontoDeDinero(MedioDePago medioDePago, MontoDeDinero montoDeDinero) {
    Objects.requireNonNull(medioDePago);
    Objects.requireNonNull(montoDeDinero);
    appendChange(new MontoDeDineroActualizado(medioDePago, montoDeDinero)).apply();
  }

  public void actualizarDireccionCasa(Direccion direccion , DireccionCasa direccionCasa) {
    Objects.requireNonNull(direccion);
    Objects.requireNonNull(direccionCasa);
    appendChange(new DireccionCasaActualizada(direccion, direccionCasa)).apply();
  }

}
