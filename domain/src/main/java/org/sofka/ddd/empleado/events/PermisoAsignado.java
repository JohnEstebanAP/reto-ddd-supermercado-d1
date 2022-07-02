package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.entitys.Permisos;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;

import java.util.Set;

public class PermisoAsignado extends DomainEvent {
  private final Permisos permisos;

  public PermisoAsignado(Permisos permisos) {
    super("ddd.empleado.permisoActualizado");
    this.permisos = permisos;
  }

  public Permisos permisos() {
    return permisos;
  }

}
