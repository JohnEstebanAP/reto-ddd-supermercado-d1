package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.entitys.TipoDeEmpleado;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;

public class TipoDeEmpleadoCreado extends DomainEvent {
  private final TipoDeEmpleado tipoDeEmpleado;

  public TipoDeEmpleadoCreado(TipoDeEmpleado tipoDeEmpleado) {
    super("ddd.empleado.tipodeempleadocreado");
    this.tipoDeEmpleado = tipoDeEmpleado;
  }

  public TipoDeEmpleado tipoDeEmpleado() {
    return tipoDeEmpleado;
  }
}
