package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.EstadoDelProducto;
import org.sofka.ddd.producto.values.Caducidad;
import org.sofka.ddd.producto.values.EstadoProducto;

public class CaducidadActualizada extends DomainEvent {

  private final EstadoDelProducto estadoDelProducto;
  private final Caducidad caducidad;

  public CaducidadActualizada(EstadoDelProducto estadoDelProducto, Caducidad caducidad) {
    super("ddd.producto.caducidadactualizada");
    this.estadoDelProducto = estadoDelProducto;
    this.caducidad = caducidad;
  }

  public EstadoDelProducto estadoDelProducto() {
    return estadoDelProducto;
  }

  public Caducidad caducidad() {
    return caducidad;
  }
}
