package org.sofka.ddd.cliente;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.cliente.values.MedioDePagoId;
import org.sofka.ddd.cliente.values.MontoDeDinero;
import org.sofka.ddd.cliente.values.TipoDePago;
import org.sofka.ddd.factura.values.Fecha;
import org.sofka.ddd.factura.values.TotalPago;
import org.sofka.ddd.factura.values.TransaccionId;

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
