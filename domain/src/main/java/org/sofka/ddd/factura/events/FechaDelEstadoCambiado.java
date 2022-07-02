package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.factura.EstadoFactura;
import org.sofka.ddd.factura.values.EstadoActual;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.Fecha;

public class FechaDelEstadoCambiado extends DomainEvent {

  private final FacturaId facturaId;
  private final EstadoFactura estadoFactura;
  private final Fecha fecha;

  public FechaDelEstadoCambiado(FacturaId facturaId, EstadoFactura estadoFactura, Fecha fecha) {
    super("ddd.factura.fechadelestadocambiado");
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
