package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.Ubicacion;

public class UbicacionActualizada extends DomainEvent {
  private final Ubicacion ubicacion;

  public UbicacionActualizada(Ubicacion ubicacion) {
    super("ddd.producto.productoagregado");
    this.ubicacion = ubicacion;
  }

  public Ubicacion ubicacion() {
    return ubicacion;
  }
}
