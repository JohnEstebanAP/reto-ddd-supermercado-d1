package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.Proveedor;
import org.sofka.ddd.producto.values.ProductoId;
import org.sofka.ddd.producto.values.TelefonoProveedor;

public class ActualizarTelefonoProvedor extends Command {


  private final ProductoId productoId;
  private final Proveedor proveedor;
  private final TelefonoProveedor telefonoProveedor;

  public ActualizarTelefonoProvedor(ProductoId productoId, Proveedor proveedor, TelefonoProveedor telefonoProveedor) {
    this.productoId  = productoId;
    this.proveedor = proveedor;
    this.telefonoProveedor = telefonoProveedor;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public Proveedor proveedor() {
    return proveedor;
  }

  public TelefonoProveedor telefonoProveedor() {
    return telefonoProveedor;
  }
}
