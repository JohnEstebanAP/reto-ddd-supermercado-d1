package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.entitys.TipoDeEmpleado;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;

public class TipoDeEmpleadoEliminado extends DomainEvent {
  private final EmpleadoId entityId;
  private final TipoDeEmpleado tipoDeEmpleado;

  public TipoDeEmpleadoEliminado(EmpleadoId entityId) {
    super("ddd.empleado.tipodeempleadoeleminado");
    this.entityId = entityId;
    this.tipoDeEmpleado = null;
  }

  public TipoDeEmpleado tipoDeDocumento() {
    return tipoDeEmpleado;
  }

  public EmpleadoId empleadoId() {
    return entityId;
  }

}
