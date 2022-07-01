package org.sofka.ddd.Empleado.values;

import co.com.sofka.domain.generic.Identity;

public class PermisoId extends Identity {
  public PermisoId() {}

  private PermisoId(String id) {
    super(id);
  }

  public static PermisoId of(String id) {
    return new PermisoId(id);
  }
}
