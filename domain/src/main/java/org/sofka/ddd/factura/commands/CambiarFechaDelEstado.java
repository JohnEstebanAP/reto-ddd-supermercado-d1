package org.sofka.ddd.factura.commands;


import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.EstadoFactura;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.Fecha;

public class CambiarFechaDelEstado extends Command {

  private final FacturaId facturaId;
  private final EstadoFactura estadoFactura;
  private final Fecha fecha;

  public CambiarFechaDelEstado(FacturaId facturaId, EstadoFactura estadoFactura, Fecha fecha) {
    this.facturaId = facturaId;
    this.estadoFactura = estadoFactura;
    this.fecha = fecha;
  }

  public FacturaId facturaId() {
    return facturaId;
  }

  public EstadoFactura estadoFactura() {
    return estadoFactura;
  }

  public Fecha fecha() {
    return fecha;
  }
}
