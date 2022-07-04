package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.values.MontoDeDinero;



public class MontoDeDineroAsignado extends DomainEvent {

  private final MedioDePago medioDePago;
  private final MontoDeDinero montoDeDinero;
  public MontoDeDineroAsignado(MedioDePago medioDePago, MontoDeDinero montoDeDinero){
    super("ddd.cliente.montodedineroasignado");
    this.medioDePago = medioDePago;
    this.montoDeDinero = montoDeDinero;
  }

  public MedioDePago medioDePago() {
    return medioDePago;
  }

  public MontoDeDinero montoDeDinero() {
    return montoDeDinero;
  }
}
