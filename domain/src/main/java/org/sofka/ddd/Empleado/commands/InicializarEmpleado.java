package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.EmpleadoId;

public class InicializarEmpleado extends Command {
  private final EmpleadoId empleadoId;

  public InicializarEmpleado(EmpleadoId empleadoId) {
    this.empleadoId = empleadoId;
  }

  public EmpleadoId empleadoId() {
    return empleadoId;
  }
}
