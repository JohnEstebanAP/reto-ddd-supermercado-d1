package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.values.Precio;
import org.sofka.ddd.producto.values.ProductoId;

public class CambiarPrecio extends Command {

  private final ProductoId productoId;
  private final Precio precio;

  public CambiarPrecio(ProductoId productoId, Precio precio) {
    this.productoId = productoId;
    this.precio = precio;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public Precio precio() {
    return precio;
  }
}
