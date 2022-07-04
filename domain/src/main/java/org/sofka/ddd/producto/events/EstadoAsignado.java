package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.EstadoDelProducto;

public class EstadoAsignado extends DomainEvent {

  private final EstadoDelProducto estadoDelProducto;

  public EstadoAsignado(EstadoDelProducto estadoDelProducto) {
    super("ddd.producto.estadoasignado");
    this.estadoDelProducto = estadoDelProducto;
  }

  public EstadoDelProducto estadoDelProducto() {
    return estadoDelProducto;
  }
}
