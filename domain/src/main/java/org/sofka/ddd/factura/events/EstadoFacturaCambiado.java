package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.factura.EstadoFactura;
import org.sofka.ddd.factura.values.EstadoActual;
import org.sofka.ddd.factura.values.FacturaId;

public class EstadoFacturaCambiado extends DomainEvent {

  private final FacturaId facturaId;
  private final EstadoFactura estadoFactura;
  private final EstadoActual estadoActual;

  public EstadoFacturaCambiado(FacturaId facturaId, EstadoFactura estadoFactura, EstadoActual estadoActual) {
    super("ddd.factura.estadofacturacambiado");
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
