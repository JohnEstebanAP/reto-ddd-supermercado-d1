package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.entitys.TipoDeEmpleado;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;

public class TipoDeEmpleadoCreado extends DomainEvent {
  private final EmpleadoId entityId;
  private final TipoDeEmpleado tipoDeEmpleado;

  public TipoDeEmpleadoCreado(EmpleadoId entityId, TipoDeEmpleado tipoDeEmpleado) {
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
