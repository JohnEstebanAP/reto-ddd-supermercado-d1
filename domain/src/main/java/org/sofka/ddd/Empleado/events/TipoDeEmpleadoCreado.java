package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.Documento;
import org.sofka.ddd.Empleado.TipoDeEmpleado;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.TipoDocumento;
import org.sofka.ddd.Empleado.values.TipoEmpleado;

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
