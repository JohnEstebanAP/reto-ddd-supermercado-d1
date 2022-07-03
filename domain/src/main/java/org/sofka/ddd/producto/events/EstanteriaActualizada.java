package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.Ubicacion;
import org.sofka.ddd.producto.values.Estanteria;

public class EstanteriaActualizada extends DomainEvent {
  private final Ubicacion ubicacion;
  private final Estanteria estanteria;

  public EstanteriaActualizada(Ubicacion ubicacion, Estanteria estanteria) {
    super("ddd.producto.estanteriaactualizada");
    this.ubicacion = ubicacion;
    this.estanteria = estanteria;
  }

  public Ubicacion ubicacion() {
    return ubicacion;
  }

  public Estanteria estanteria() {
    return estanteria;
  }
}
