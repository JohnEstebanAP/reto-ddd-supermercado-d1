package org.sofka.ddd.empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.entitys.Documento;
import org.sofka.ddd.empleado.entitys.Permisos;
import org.sofka.ddd.empleado.entitys.TipoDeEmpleado;
import org.sofka.ddd.empleado.events.*;
import org.sofka.ddd.empleado.values.*;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.empleado.values.ids.PermisoId;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Empleado extends AggregateEvent<EmpleadoId> {

  private NombreEmpleado nombreEmpleado;
  private TelefonoEmpleado telefonoEmpleado;
  protected Set<Permisos> permisos;
  protected Documento documento;
  protected TipoDeEmpleado tipoDeEmpleado;

  public Empleado(
      EmpleadoId entityId,
      NombreEmpleado nombreEmpleado,
      TelefonoEmpleado telefonoEmpleado,
      Set<Permisos> permisos,
      Documento documento,
      TipoDeEmpleado tipoDeEmpleado) {
    super(entityId);
    this.nombreEmpleado = nombreEmpleado;
    this.telefonoEmpleado = telefonoEmpleado;
    this.permisos = permisos;
    this.documento = documento;
    this.tipoDeEmpleado = tipoDeEmpleado;

    appendChange(
            new EmpleadoCreado(
                entityId, nombreEmpleado, telefonoEmpleado, permisos, documento, tipoDeEmpleado))
        .apply();
  }

  private Empleado(EmpleadoId entityId) {
    super(entityId);
    subscribe(new EmpleadoChange(this));
  }

  public static Empleado from(EmpleadoId empleadoId, List<DomainEvent> events) {
    var empleado = new Empleado(empleadoId);
    events.forEach(empleado::applyEvent);
    return empleado;
  }

  public void actualizarNombre(NombreEmpleado nombre) {
    Objects.requireNonNull(nombre);
    appendChange(new NombreActualizado(nombre)).apply();
  }

  public void actualizarTelefono(TelefonoEmpleado telefonoEmpleado) {
    Objects.requireNonNull(telefonoEmpleado);
    appendChange(new TelefonoActualizado(telefonoEmpleado)).apply();
  }

  public void asignarPermiso(Permisos permisos) {
    Objects.requireNonNull(permisos);
    appendChange(new PermisoAsignado(permisos)).apply();
  }

  public void eliminarPermiso(PermisoId permisoId) {
    Objects.requireNonNull(permisoId);
    appendChange(new PermisoEliminado(permisoId)).apply();
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

  public void crearTipoDeEmpleado(TipoDeEmpleado tipoDeEmpleado) {
    Objects.requireNonNull(tipoDeEmpleado);
    appendChange(new TipoDeEmpleadoCreado(tipoDeEmpleado)).apply();
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

  public NombreEmpleado nombreEmpleado() {
    return nombreEmpleado;
  }

  public TelefonoEmpleado telefonoEmpleado() {
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
  }
}
