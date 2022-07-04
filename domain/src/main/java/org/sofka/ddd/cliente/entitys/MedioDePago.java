package org.sofka.ddd.cliente.entitys;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.cliente.values.ids.MedioDePagoId;
import org.sofka.ddd.cliente.values.MontoDeDinero;
import org.sofka.ddd.cliente.values.TipoDePago;

public class MedioDePago extends Entity<MedioDePagoId> {

  private TipoDePago tipoDePago;
  private MontoDeDinero montoDeDinero;

  public MedioDePago(MedioDePagoId entityId, TipoDePago tipoDePago, MontoDeDinero montoDeDinero) {
    super(entityId);
    this.tipoDePago = tipoDePago;
    this.montoDeDinero = montoDeDinero;
  }

  public void actualizarTipoDePago(TipoDePago tipoDePago) {
    this.tipoDePago = tipoDePago;
  }

  public void actualizarMontoDeDinero(MontoDeDinero montoDeDinero) {
    this.montoDeDinero = montoDeDinero;
  }
}
