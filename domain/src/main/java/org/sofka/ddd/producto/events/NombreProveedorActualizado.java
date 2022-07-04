package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.Proveedor;
import org.sofka.ddd.producto.values.NombreProveedor;
import org.sofka.ddd.producto.values.TelefonoProveedor;

public class NombreProveedorActualizado extends DomainEvent {

  private final Proveedor proveedor;
  private final NombreProveedor nombreProveedor;

  public NombreProveedorActualizado(Proveedor proveedor, NombreProveedor nombreProveedor) {
    super("ddd.producto.nombreproveedoractualizado");
    this.proveedor = proveedor;
    this.nombreProveedor = nombreProveedor;
  }

  public Proveedor proveedor() {
    return proveedor;
  }

  public NombreProveedor nombreProveedor() {
    return nombreProveedor;
  }
}
