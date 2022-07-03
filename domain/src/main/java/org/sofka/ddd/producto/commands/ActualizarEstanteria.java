package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.Ubicacion;
import org.sofka.ddd.producto.values.Estanteria;
import org.sofka.ddd.producto.values.ProductoId;

public class ActualizarEstanteria extends Command {
  private final ProductoId productoId;
  private final Ubicacion ubicacion;

  private final Estanteria estanteria;

  public ActualizarEstanteria(ProductoId productoId, Ubicacion ubicacion, Estanteria estanteria) {
    this.productoId = productoId;
    this.ubicacion = ubicacion;
    this.estanteria = estanteria;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public Ubicacion ubicacion() {
    return ubicacion;
  }

  public Estanteria estanteria() {
    return estanteria;
  }
}
