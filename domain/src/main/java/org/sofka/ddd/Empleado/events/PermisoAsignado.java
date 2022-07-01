package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.Permisos;
import org.sofka.ddd.Empleado.values.EmpleadoId;

import java.util.Set;

public class PermisoAsignado extends DomainEvent {
  private final EmpleadoId entityId;
  private final Set<Permisos> permisos;

  public PermisoAsignado(EmpleadoId entityId, Set<Permisos> permisos) {
    super("ddd.empleado.permisoActualizado");
    this.entityId = entityId;
    this.permisos = permisos;
  }

  public Set<Permisos> permisos() {
    return permisos;
  }

  public EmpleadoId empleadoId() {
    return entityId;
  }
}