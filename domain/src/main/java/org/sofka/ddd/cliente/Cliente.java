package org.sofka.ddd.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.events.ClienteCreado;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.cliente.values.NombreCliente;

import java.util.List;


public class Cliente extends AggregateEvent<ClienteId> {

  private NombreCliente nombreCliente;
  private Documento documento;
  private MedioDePago medioDePago;
  private Direccion direccionCliente;

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

/*
  public void inicializarEmpleado() {
    var empleadoId  = entityId;
    Objects.requireNonNull(entityId);
   // appendChange(new EmpleadoInicializado(entityId)).apply();
  }
/*
  public void actualizarNombre(EmpleadoId entityId, NombreEmpleado nombre) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(nombre);
    appendChange(new NombreActualizado(entityId, nombre)).apply();
  }

  public void actualizarTelefono(EmpleadoId entityId, TelefonoEmpleado telefonoEmpleado) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(telefonoEmpleado);
    appendChange(new TelefonoActualizado(entityId, telefonoEmpleado)).apply();
  }

  public void asignarPermiso(EmpleadoId entityId, Set<Permisos> permisos) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(permisos);
    appendChange(new PermisoAsignado(entityId, permisos)).apply();
  }

  public void eliminarPermiso(EmpleadoId entityId, Set<Permisos> permisos) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(permisos);
    appendChange(new PermisoEliminado(entityId, permisos)).apply();
  }

  public void actualizarPermiso(EmpleadoId entityId, Set<Permisos> permisos) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(permisos);
    appendChange(new PermisoActualizado(entityId, permisos)).apply();
  }

  public void asignarDocumento(EmpleadoId entityId, Documento documento) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(documento);
    appendChange(new DocumentoAsignado(entityId, documento)).apply();
  }

  public void asignarNumeroDocumento(
      EmpleadoId entityId, Documento documento, NumeroDocumento numeroDocumento) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(documento);
    Objects.requireNonNull(numeroDocumento);
    appendChange(new NumeroDocumentoAsignado(entityId, documento, numeroDocumento)).apply();
  }

  public void asignarasignarTipoDocumento(
      EmpleadoId entityId, Documento documento, TipoDocumento tipoDocumento) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(documento);
    Objects.requireNonNull(tipoDocumento);
    appendChange(new TipoDeDocumentoAsignado(entityId, documento, tipoDocumento)).apply();
  }

  public void crearTipoDeEmpleado(EmpleadoId entityId, TipoDeEmpleado tipoDeEmpleado) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(tipoDeEmpleado);
    appendChange(new TipoDeEmpleadoCreado(entityId, tipoDeEmpleado)).apply();
  }

  public void eliminarTipoDeEmpleado(EmpleadoId entityId) {
    Objects.requireNonNull(entityId);
    appendChange(new TipoDeEmpleadoEliminado(entityId)).apply();
  }

  public void actualizarTipoDeEmpleado(EmpleadoId entityId, TipoDeEmpleado tipoDeEmpleado) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(tipoDeEmpleado);
    appendChange(new TipoDeEmpleadoActualizado(entityId, tipoDeEmpleado)).apply();
  }
*/
  /*
    protected Optional<Calificacion> getCalificacionPorId(CalificacionId calificacionId) {
        return calificaciones()
                .stream()
                .filter(calificacion -> calificacion.identity().equals(calificacionId))
                .findFirst();
    }
  */
/*
  public NombreEmpleado nombreEmpleado() {
    return nombreEmpleado;
  }

  public TelefonoEmpleado telefonoEmpleado(){
    return telefonoEmpleado;
  }

  public void nombreEmpleado(NombreEmpleado nombreEmpleado) {
    this.nombreEmpleado = nombreEmpleado;
  }

  public void telefonoEmpleado(TelefonoEmpleado telefonoEmpleado) {
    this.telefonoEmpleado = telefonoEmpleado;
  }

  public void permisos(Set<Permisos> permisos) {
    this.permisos = permisos;
  }

  public void documento(Documento documento) {
    this.documento = documento;
  }

  public void tipoDeEmpleado(TipoDeEmpleado tipoDeEmpleado) {
    this.tipoDeEmpleado = tipoDeEmpleado;
  }*/
}
