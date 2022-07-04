package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.MedioDePago;



public class MedioDePagoAsignado extends DomainEvent {

  private final MedioDePago medioDePago;

  public MedioDePagoAsignado(MedioDePago medioDePago) {
    super("ddd.cliente.medidepagoasignado");
    this.medioDePago = medioDePago;
  }

  public MedioDePago medioDePago() {
    return medioDePago;
  }
}
