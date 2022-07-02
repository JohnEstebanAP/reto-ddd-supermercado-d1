package org.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class DireccionId extends Identity {
  public DireccionId() {}

  private DireccionId(String id) {
    super(id);
  }

  public static DireccionId of(String id) {
    return new DireccionId(id);
  }
}
