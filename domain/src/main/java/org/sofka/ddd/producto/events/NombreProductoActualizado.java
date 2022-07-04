package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.values.NombreProducto;

public class NombreProductoActualizado extends DomainEvent {

  private final NombreProducto nombreProducto;

  public NombreProductoActualizado(NombreProducto nombreProducto) {
    super("ddd.producto.nombreproductoactualizado");
    this.nombreProducto = nombreProducto;
  }

  public NombreProducto nombreProducto() {
    return nombreProducto;
  }
}
