package org.sofka.ddd.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.Fecha;
import org.sofka.ddd.factura.values.TotalPago;
import org.sofka.ddd.producto.values.ProductoId;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.factura.events.*;

import java.util.List;
import java.util.Set;

public class Factura extends AggregateEvent<FacturaId> {

  protected TotalPago totalPago;
  protected Fecha fecha;
  protected Set<ProductoId> producto;
  protected EmpleadoId empleadoId;
  protected ClienteId clienteid;


  public Factura(FacturaId entityId, TotalPago totalPago, Fecha fecha, Set<ProductoId> producto, EmpleadoId empleadoId, ClienteId clienteid) {
    super(entityId);
    this.totalPago = totalPago;
    this.fecha = fecha;
    this.producto = producto;
    this.empleadoId = empleadoId;
    this.clienteid = clienteid;

    appendChange(new FacturaAgregada(entityId, totalPago, fecha, producto, empleadoId, clienteid)).apply();
  }


  public Factura(FacturaId entityId) {
    super(entityId);
    subscribe(new FacturaChange(this));
  }

  public static Factura from(FacturaId facturaId, List<DomainEvent> events) {
    var factura = new Factura(facturaId);
    events.forEach(factura::applyEvent);
    return factura;
  }

}
