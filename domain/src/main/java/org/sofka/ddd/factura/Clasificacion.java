package org.sofka.ddd.factura;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.factura.values.ClasificacionId;
import org.sofka.ddd.factura.values.Tipo;

public class Clasificacion extends Entity<ClasificacionId> {

  protected Tipo tipo;

  public Clasificacion(ClasificacionId entityId, Tipo tipo) {
    super(entityId);
    this.tipo = tipo;
  }

  public void cambiarTipo(Tipo tipo) {
    this.tipo = tipo;
  }

  public Tipo tipo() {
    return this.tipo;
  }
}
