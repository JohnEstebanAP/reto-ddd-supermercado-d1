package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.entitys.TipoDeEmpleado;
import org.sofka.ddd.empleado.values.TipoEmpleado;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;

public class CrearTipoDeEmpleado extends Command {

  private final EmpleadoId entityId;
  private final TipoDeEmpleado tipoDeEmpleado;

  public CrearTipoDeEmpleado(
      EmpleadoId entityId, TipoDeEmpleado tipoDeEmpleado) {
    this.entityId = entityId;
    this.tipoDeEmpleado = tipoDeEmpleado;
  }

  public EmpleadoId entityId() {
    return entityId;
  }

  public TipoDeEmpleado tipoDeEmpleado() {
    return tipoDeEmpleado;
  }
}
