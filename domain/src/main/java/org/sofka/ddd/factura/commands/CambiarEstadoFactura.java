package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.EstadoFactura;
import org.sofka.ddd.factura.values.EstadoActual;
import org.sofka.ddd.factura.values.FacturaId;

public class CambiarEstadoFactura extends Command {

  private final FacturaId facturaId;
  private final EstadoFactura estadoFactura;
  private final EstadoActual estadoActual;

  public CambiarEstadoFactura(FacturaId facturaId, EstadoFactura estadoFactura, EstadoActual estadoActual) {
    this.facturaId = facturaId;
    this.estadoFactura = estadoFactura;
    this.estadoActual = estadoActual;
  }

  public FacturaId facturaId() {
    return facturaId;
  }

  public EstadoFactura estadoFactura() {
    return estadoFactura;
  }

  public EstadoActual estadoActual() {
    return estadoActual;
  }
}
