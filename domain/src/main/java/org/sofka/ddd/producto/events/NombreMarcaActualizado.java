package org.sofka.ddd.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.values.NombreMarca;

public class NombreMarcaActualizado extends DomainEvent {

  private final NombreMarca nombreMarca;

  public NombreMarcaActualizado(NombreMarca nombreMarca) {
    super("ddd.producto.nombremarcaactualizado");
    this.nombreMarca = nombreMarca;
  }

  public NombreMarca nombreMarca() {
    return nombreMarca;
  }
}
