package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.Transaccion;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.TotalPago;

public class CambiarTotalPago extends Command {

  FacturaId facturaId;
  Transaccion transaccion;
  TotalPago totalPago;

  public CambiarTotalPago(FacturaId facturaId, Transaccion transaccion, TotalPago totalPago) {
    this.facturaId = facturaId;
    this.transaccion = transaccion;
    this.totalPago = totalPago;
  }

  public FacturaId facturaId() {
    return facturaId;
  }

  public Transaccion transaccion() {
    return transaccion;
  }

  public TotalPago totalPago() {
    return totalPago;
  }
}
