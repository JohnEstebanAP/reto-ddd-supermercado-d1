package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.Proveedor;
import org.sofka.ddd.producto.values.NombreProveedor;
import org.sofka.ddd.producto.values.ProductoId;

public class ActualizarNombreProvedor extends Command {


  private final ProductoId productoId;
  private final Proveedor proveedor;
  private final NombreProveedor nombreProveedor;

  public ActualizarNombreProvedor(ProductoId productoId, Proveedor proveedor, NombreProveedor nombreProveedor) {

    this.productoId  = productoId;
    this.proveedor = proveedor;
    this.nombreProveedor = nombreProveedor;
  }

  public ProductoId productoId() {
    return productoId;
  }

  public Proveedor proveedor() {
    return proveedor;
  }

  public NombreProveedor nombreProveedor() {
    return nombreProveedor;
  }
}
