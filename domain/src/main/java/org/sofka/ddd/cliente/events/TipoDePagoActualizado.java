package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.values.TipoDePago;


public class TipoDePagoActualizado extends DomainEvent {

  private final MedioDePago medioDePago;
  private final TipoDePago tipoDePago;
  public TipoDePagoActualizado(MedioDePago medioDePago, TipoDePago tipoDePago){
    super("ddd.cliente.tipodedocumentoasignado");
    this.medioDePago = medioDePago;
    this.tipoDePago = tipoDePago;
  }

  public MedioDePago medioDePago() {
    return medioDePago;
  }

  public TipoDePago tipoDePago() {
    return tipoDePago;
  }
}
