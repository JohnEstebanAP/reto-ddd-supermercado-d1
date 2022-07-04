package org.sofka.ddd.producto.commands;


import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.values.ProductoId;
import org.sofka.ddd.producto.values.Stock;

public class ActualizarStock extends Command {

  private final ProductoId productoId;
  private final Stock stock;

  public ActualizarStock(ProductoId productoId, Stock stock) {
    this.productoId  = productoId;
    this.stock = stock;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public Stock stock() {
    return stock;
  }
}
