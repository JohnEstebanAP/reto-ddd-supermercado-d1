package org.sofka.ddd.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.factura.events.*;
import org.sofka.ddd.factura.values.*;
import org.sofka.ddd.producto.values.ProductoId;

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

  public void eliminarFactura(FacturaId entityId) {
    Objects.requireNonNull(entityId);
    appendChange(new FacturaEliminada(entityId)).apply();
  }

  public void agregarCliente(FacturaId facturaId, ClienteId clienteId) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(clienteId);
    appendChange(new ClienteAgregado(facturaId, clienteId)).apply();
  }

  public void actualizarCliente(FacturaId facturaId, ClienteId clienteId) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(clienteId);
    appendChange(new ClienteActualizado(facturaId, clienteId)).apply();
  }

  public void asociarVendedor(FacturaId facturaId, EmpleadoId empleadoId) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(empleadoId);
    appendChange(new VendedorAsociado(facturaId, empleadoId)).apply();
  }

  public void actualizarVendedor(FacturaId facturaId, EmpleadoId empleadoId) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(empleadoId);
    appendChange(new VendedorActualizado(facturaId, empleadoId)).apply();
  }

  public void asociarProducto(FacturaId facturaId, ProductoId productoId) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(productoId);
    appendChange(new ProductoAsociado(facturaId, productoId)).apply();
  }

  public void eliminarProductoAsociado(FacturaId facturaId, ProductoId productoId) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(productoId);
    appendChange(new ProductoAsociadoEliminado(facturaId, productoId)).apply();
  }

  public void cambiarTotalPago(FacturaId facturaId, Transaccion transaccion, TotalPago totalPago) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(transaccion);
    Objects.requireNonNull(totalPago);
    appendChange(new TotalPagoCambiado(facturaId, transaccion, totalPago)).apply();
  }

  public void cambiarFechaDelaTransaccion(FacturaId facturaId, Transaccion transaccion, Fecha fecha) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(transaccion);
    Objects.requireNonNull(fecha);
    appendChange(new FechaDelaTransaccionCambiado(facturaId, transaccion, fecha)).apply();
  }

  public void cambiarEstadoFactura(FacturaId facturaId, EstadoFactura estadoFactura, EstadoActual estadoActual) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(estadoFactura);
    Objects.requireNonNull(estadoActual);
    appendChange(new EstadoFacturaCambiado(facturaId, estadoFactura, estadoActual)).apply();
  }

  public void cambiarFechaDelEstado(FacturaId facturaId, EstadoFactura estadoFactura, Fecha fecha) {
    Objects.requireNonNull(facturaId);
    Objects.requireNonNull(estadoFactura);
    Objects.requireNonNull(fecha);
    appendChange(new FechaDelEstadoCambiado(facturaId, estadoFactura, fecha)).apply();
  }
}
