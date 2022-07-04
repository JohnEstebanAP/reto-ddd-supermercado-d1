package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.Proveedor;
import org.sofka.ddd.producto.values.TelefonoProveedor;

public class TelefonoProveedorActualizado extends DomainEvent {

  private final Proveedor proveedor;
  private final TelefonoProveedor telefonoProveedor;

  public TelefonoProveedorActualizado(Proveedor proveedor, TelefonoProveedor telefonoProveedor) {
    super("ddd.producto.telefonoproveedoractualizado");
    this.proveedor = proveedor;
    this.telefonoProveedor = telefonoProveedor;
  }

  public Proveedor proveedor() {
    return proveedor;
  }

  public TelefonoProveedor telefonoProveedor() {
    return telefonoProveedor;
  }
}
