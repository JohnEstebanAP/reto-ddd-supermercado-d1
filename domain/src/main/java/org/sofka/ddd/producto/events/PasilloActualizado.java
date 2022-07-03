package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.Ubicacion;
import org.sofka.ddd.producto.values.Pasillo;

public class PasilloActualizado extends DomainEvent {
  private final Ubicacion ubicacion;
  private final Pasillo pasillo;

  public PasilloActualizado(Ubicacion ubicacion, Pasillo pasillo) {
    super("ddd.producto.pasilloactualizado");
    this.ubicacion = ubicacion;
    this.pasillo = pasillo;
  }

  public Ubicacion ubicacion() {
    return ubicacion;
  }

  public Pasillo pasillo() {
    return pasillo;
  }
}
