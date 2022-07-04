package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.values.NombreProducto;
import org.sofka.ddd.producto.values.ProductoId;

public class ActualizarNombreProducto extends Command {

  private final ProductoId productoId;
  private final NombreProducto nombreProducto;

  public ActualizarNombreProducto(ProductoId productoId, NombreProducto nombreProducto) {
    this.productoId  = productoId;
    this.nombreProducto = nombreProducto;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public NombreProducto nombreProducto() {
    return nombreProducto;
  }
}
