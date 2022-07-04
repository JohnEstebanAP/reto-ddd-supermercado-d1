package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.EstadoDelProducto;
import org.sofka.ddd.producto.values.ProductoId;

public class AsignarEstado extends Command {


  private final ProductoId productoId;
  private final EstadoDelProducto estadoDelProducto;

  public AsignarEstado(ProductoId productoId, EstadoDelProducto estadoDelProducto) {

    this.productoId  = productoId;
    this.estadoDelProducto = estadoDelProducto;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public EstadoDelProducto estadoDelProducto() {
    return estadoDelProducto;
  }
}
