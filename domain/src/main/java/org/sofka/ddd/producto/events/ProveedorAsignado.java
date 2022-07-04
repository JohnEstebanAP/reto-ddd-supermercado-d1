package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.Proveedor;
public class ProveedorAsignado extends DomainEvent {

  private final Proveedor proveedor;

  public ProveedorAsignado(Proveedor proveedor) {
    super("ddd.producto.provedorasignado");
    this.proveedor = proveedor;
  }

  public Proveedor proveedor() {
    return proveedor;
  }
}
