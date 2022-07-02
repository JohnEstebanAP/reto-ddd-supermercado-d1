package org.sofka.ddd.empleado.values.ids;

import co.com.sofka.domain.generic.Identity;

public class TipoDeEmpleadoId extends Identity {
  public TipoDeEmpleadoId() {}

  private TipoDeEmpleadoId(String id) {
    super(id);
  }

  public static TipoDeEmpleadoId of(String id) {
    return new TipoDeEmpleadoId(id);
  }
}
