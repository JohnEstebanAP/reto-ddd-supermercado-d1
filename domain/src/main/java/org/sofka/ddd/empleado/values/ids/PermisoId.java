package org.sofka.ddd.empleado.values.ids;

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
