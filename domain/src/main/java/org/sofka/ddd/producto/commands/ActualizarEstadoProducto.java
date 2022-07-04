package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.EstadoDelProducto;
import org.sofka.ddd.producto.values.EstadoProducto;
import org.sofka.ddd.producto.values.ProductoId;

public class ActualizarEstadoProducto extends Command {


  private final ProductoId productoId;
  private final EstadoDelProducto estadoDelProducto;
  private final EstadoProducto estadoProducto;

  public ActualizarEstadoProducto(ProductoId productoId, EstadoDelProducto estadoDelProducto, EstadoProducto estadoProducto) {

    this.productoId  = productoId;
    this.estadoDelProducto = estadoDelProducto;
    this.estadoProducto = estadoProducto;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public EstadoDelProducto estadoDelProducto() {
    return estadoDelProducto;
  }

  public EstadoProducto estadoProducto() {
    return estadoProducto;
  }
}
