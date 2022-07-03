package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.values.ProductoId;

public class EliminarProducto extends Command {
  private final ProductoId productoId;

  public EliminarProducto(ProductoId productoId) {
    this.productoId = productoId;
  }

  public ProductoId productoId() {
    return productoId;
  }
}
