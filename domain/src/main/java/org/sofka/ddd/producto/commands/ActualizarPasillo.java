package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.Ubicacion;
import org.sofka.ddd.producto.values.Estanteria;
import org.sofka.ddd.producto.values.Pasillo;
import org.sofka.ddd.producto.values.ProductoId;

public class ActualizarPasillo extends Command {
  private final ProductoId productoId;
  private final Ubicacion ubicacion;

  private final Pasillo pasillo;

  public ActualizarPasillo(ProductoId productoId, Ubicacion ubicacion, Pasillo pasillo) {
    this.productoId = productoId;
    this.ubicacion = ubicacion;
    this.pasillo = pasillo;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public Ubicacion ubicacion() {
    return ubicacion;
  }

  public Pasillo pasillo() {
    return pasillo;
  }
}
