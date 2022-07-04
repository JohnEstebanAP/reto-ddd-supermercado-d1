package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.values.Precio;


public class PrecioCambiado extends DomainEvent {

  private final Precio precio;

  public PrecioCambiado(Precio precio) {
    super("ddd.producto.precioactualizado");
    this.precio = precio;
  }

  public Precio precio() {
    return precio;
  }
}
