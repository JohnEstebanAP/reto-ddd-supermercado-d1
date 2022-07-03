package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.Ubicacion;
import org.sofka.ddd.producto.values.ProductoId;

public class ActualizarUbicacion extends Command {
  private final ProductoId productoId;
  private final Ubicacion ubicacion;

  public ActualizarUbicacion(ProductoId productoId, Ubicacion ubicacion) {
    this.productoId = productoId;
    this.ubicacion = ubicacion;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public Ubicacion ubicacion() {
    return ubicacion;
  }
}
