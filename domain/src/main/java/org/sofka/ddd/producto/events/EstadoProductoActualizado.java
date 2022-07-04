package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.EstadoDelProducto;
import org.sofka.ddd.producto.values.EstadoProducto;

public class EstadoProductoActualizado extends DomainEvent {

  private final EstadoDelProducto estadoDelProducto;
  private final EstadoProducto estadoProducto;

  public EstadoProductoActualizado(EstadoDelProducto estadoDelProducto, EstadoProducto estadoProducto) {
    super("ddd.producto.estadoproductoactualizado");
    this.estadoDelProducto = estadoDelProducto;
    this.estadoProducto = estadoProducto;
  }

  public EstadoDelProducto estadoDelProducto() {
    return estadoDelProducto;
  }

  public EstadoProducto estadoProducto() {
    return estadoProducto;
  }
}
