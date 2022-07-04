package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.Proveedor;
import org.sofka.ddd.producto.values.ProductoId;

public class AsignarProveedor extends Command {


  private final ProductoId productoId;
  private final Proveedor proveedor;

  public AsignarProveedor(ProductoId productoId, Proveedor proveedor) {
    this.productoId  = productoId;
    this.proveedor = proveedor;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public Proveedor proveedor() {
    return proveedor;
  }
}
