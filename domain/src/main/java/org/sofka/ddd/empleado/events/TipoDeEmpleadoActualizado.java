package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.TipoDeEmpleado;
import org.sofka.ddd.empleado.values.EmpleadoId;

public class TipoDeEmpleadoActualizado extends DomainEvent {
  private final EmpleadoId entityId;
  private final TipoDeEmpleado tipoDeEmpleado;

  public TipoDeEmpleadoActualizado(EmpleadoId entityId, TipoDeEmpleado tipoDeEmpleado) {
    super("ddd.empleado.tipodeempleadocreado");
    this.entityId = entityId;
    this.tipoDeEmpleado = tipoDeEmpleado;
  }

  public TipoDeEmpleado tipoDeDocumento() {
    return tipoDeEmpleado;
  }

  public EmpleadoId empleadoId() {
    return entityId;
  }
}
