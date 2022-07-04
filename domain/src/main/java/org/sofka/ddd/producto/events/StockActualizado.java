package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.values.Stock;

public class StockActualizado extends DomainEvent {

  private final Stock stock;

  public StockActualizado(Stock stock) {
    super("ddd.producto.stockactualizado");
    this.stock = stock;
  }

  public Stock stock() {
    return stock;
  }
}
