package org.sofka.ddd.factura;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.factura.values.Fecha;
import org.sofka.ddd.factura.values.TotalPago;
import org.sofka.ddd.factura.values.TransaccionId;

public class Transaccion extends Entity<TransaccionId> {

  private TotalPago totalPago;
  private Fecha fecha;

  public Transaccion(TransaccionId entityId, TotalPago totalPago, Fecha fecha) {
    super(entityId);
    this.totalPago = totalPago;
    this.fecha = fecha;
  }

  public void cambiarTotalPago(TotalPago totalPago) {
    this.totalPago = totalPago;
  }

  public void cambiarFecha(Fecha fecha) {
    this.fecha = fecha;
  }
}
