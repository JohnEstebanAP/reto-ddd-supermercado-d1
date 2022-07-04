package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.EstadoDelProducto;
import org.sofka.ddd.producto.values.Caducidad;
import org.sofka.ddd.producto.values.ProductoId;

public class ActualizarCaducidad extends Command {


  private final ProductoId productoId;
  private final EstadoDelProducto estadoDelProducto;
  private final Caducidad caducidad;

  public ActualizarCaducidad(ProductoId productoId, EstadoDelProducto estadoDelProducto, Caducidad caducidad) {

    this.productoId  = productoId;
    this.estadoDelProducto = estadoDelProducto;
    this.caducidad = caducidad;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public EstadoDelProducto estadoDelProducto() {
    return estadoDelProducto;
  }

  public Caducidad caducidad() {
    return caducidad;
  }
}
