package org.sofka.ddd.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.empleado.events.NombreActualizado;
import org.sofka.ddd.empleado.values.NombreEmpleado;
import org.sofka.ddd.factura.values.EstadoActual;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.Fecha;
import org.sofka.ddd.factura.values.TotalPago;
import org.sofka.ddd.producto.values.ProductoId;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.factura.events.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Factura extends AggregateEvent<FacturaId> {

  protected Set<ProductoId> producto;
  protected EmpleadoId empleadoId;
  protected ClienteId clienteid;

  protected Transaccion transaccion;
  protected EstadoFactura estadoFactura;

  public Factura(
      FacturaId entityId,
      Set<ProductoId> producto,
      EmpleadoId empleadoId,
      ClienteId clienteid,
      Transaccion transaccion,
      EstadoFactura estadoFactura) {
    super(entityId);
    this.producto = producto;
    this.empleadoId = empleadoId;
    this.clienteid = clienteid;
    this.transaccion = transaccion;
    this.estadoFactura = estadoFactura;
    appendChange(
            new FacturaAgregada(
                entityId, producto, empleadoId, clienteid, transaccion, estadoFactura))
        .apply();
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

  public void actualizarNombre(EmpleadoId entityId, NombreEmpleado nombre) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(nombre);
    appendChange(new NombreActualizado(entityId, nombre)).apply();
  }

}
