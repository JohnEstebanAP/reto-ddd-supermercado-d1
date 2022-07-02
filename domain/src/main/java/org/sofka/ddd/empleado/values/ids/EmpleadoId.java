package org.sofka.ddd.empleado.values.ids;

import co.com.sofka.domain.generic.Identity;

public class EmpleadoId extends Identity {
  public EmpleadoId() {}

  private EmpleadoId(String id) {
    super(id);
  }

  public static EmpleadoId of(String id) {
    return new EmpleadoId(id);
  }
}
