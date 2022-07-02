package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.producto.values.Estanteria;
import org.sofka.ddd.producto.values.Pasillo;
import org.sofka.ddd.producto.values.UbicacionId;

public class Ubicacion extends Entity<UbicacionId> {

  protected Estanteria estanteria;
  protected Pasillo Pasillo;

  public Ubicacion(UbicacionId entityId, Estanteria estanteria, org.sofka.ddd.producto.values.Pasillo pasillo) {
    super(entityId);
    this.estanteria = estanteria;
    Pasillo = pasillo;
  }

  public void actualizarEstanteria(Estanteria estanteria) {
    this.estanteria = estanteria;
  }

  public void actualizarPasillo(org.sofka.ddd.producto.values.Pasillo pasillo) {
    Pasillo = pasillo;
  }
}
