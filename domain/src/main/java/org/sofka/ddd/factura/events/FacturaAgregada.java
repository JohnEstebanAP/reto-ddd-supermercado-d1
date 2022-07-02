package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.factura.EstadoFactura;
import org.sofka.ddd.factura.Transaccion;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.producto.values.ProductoId;

import java.util.Set;

public class FacturaAgregada extends DomainEvent {

  private final FacturaId facturaId;
  protected Set<ProductoId> producto;
  protected EmpleadoId empleadoId;
  protected ClienteId clienteid;

  protected Transaccion transaccion;
  protected EstadoFactura estadoFactura;

  public FacturaAgregada(
      FacturaId facturaId,
      Set<ProductoId> producto,
      EmpleadoId empleadoId,
      ClienteId clienteid,
      Transaccion transaccion,
      EstadoFactura estadoFactura) {
    super("ddd.factura.facturaagregada");
    this.facturaId = facturaId;
    this.producto = producto;
    this.empleadoId = empleadoId;
    this.clienteid = clienteid;
    this.transaccion = transaccion;
    this.estadoFactura = estadoFactura;
  }

  public FacturaId facturaId() {
    return facturaId;
  }

  public Transaccion transaccion() {
    return transaccion;
  }

  public EstadoFactura estadoFactura() {
    return estadoFactura;
  }

  public Set<ProductoId> producto() {
    return producto;
  }

  public EmpleadoId empleadoId() {
    return empleadoId;
  }

  public ClienteId clienteid() {
    return clienteid;
  }
}
