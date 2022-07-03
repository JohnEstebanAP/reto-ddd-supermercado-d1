package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.values.ProductoId;

public class ProductoEliminado extends DomainEvent {
  private final ProductoId productoId;

  public ProductoEliminado(ProductoId productoId) {
    super("ddd.producto.productoeliminado");
    this.productoId = productoId;
  }

  public ProductoId productoId() {
    return productoId;
  }
}
