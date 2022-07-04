package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.producto.values.ProductoId;

public class EliminarProductoAsociado extends Command {

  private final FacturaId facturaId;
  private final ProductoId ProductoId;

  public EliminarProductoAsociado(FacturaId facturaId, ProductoId productoId) {

    this.facturaId = facturaId;
    ProductoId = null;
  }

  public FacturaId facturaId() {
    return facturaId;
  }

  public ProductoId productoId() {
    return ProductoId;
  }
}
