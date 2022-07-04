package org.sofka.ddd.cliente.values.ids;

import co.com.sofka.domain.generic.Identity;

public class MedioDePagoId extends Identity {
  public MedioDePagoId() {}

  private MedioDePagoId(String id) {
    super(id);
  }

  public static MedioDePagoId of(String id) {
    return new MedioDePagoId(id);
  }
}
