package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.Direccion;
import org.sofka.ddd.cliente.values.DireccionCasa;


public class DireccionCasaActualizada extends DomainEvent {

  private final Direccion direccion;
  private final DireccionCasa direccionCasa;

  public DireccionCasaActualizada(Direccion direccion, DireccionCasa direccionCasa){
    super("ddd.cliente.direccioncasaactualizada");
    this.direccion = direccion;
    this.direccionCasa = direccionCasa;
  }

  public Direccion direccion() {
    return direccion;
  }

  public DireccionCasa direccionCasa() {
    return direccionCasa;
  }
}
