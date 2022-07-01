package org.sofka.ddd.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.factura.values.ClienteId;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.Fecha;
import org.sofka.ddd.factura.values.NombreCliente;
import org.sofka.ddd.producto.values.ProductoId;
import org.sofka.ddd.vendedor.values.VendedorId;
import org.sofka.ddd.factura.events.*;

import java.util.List;
import java.util.Set;

public class Factura extends AggregateEvent<FacturaId> {

  protected Cliente cliente;
  protected Set<ProductoId> productos;

  protected VendedorId vendedorId;

  protected Fecha fecha;
  public Factura(FacturaId entityId, ClienteId clienteId) {
    super(entityId);
    appendChange(new FacturaAgregada(entityId, clienteId)).apply();
  }

  public Factura(FacturaId entityId) {
    super(entityId);
    subscribe(new ClienteChange(this));
  }

  public static Factura from(FacturaId facturaId, List<DomainEvent> events) {
    var factura = new Factura(facturaId);
    events.forEach(factura::applyEvent);
    return factura;
  }

  public void agregarCliente(Cliente cliente) {
    appendChange(new ClienteAgregado(cliente)).apply();
  }

  public void asociarVendedor(VendedorId entityId, NombreCliente nombre) {
    appendChange(new VendedorAsociado(entityId, nombre)).apply();
  }

  public void asociarProducto() {
    appendChange(new ProductoAsociado()).apply();
  }

  public void actualizarNombreDeUnCliente(NombreCliente nombre) {
    appendChange(new NombreDeUnClienteActualizado(nombre)).apply();
  }

  public void agregarClasificacion(Clasificacion clasificacion) {
    appendChange(new ClasificacionAgregada()).apply();
  }

  public void cambiarTipoDeUnaClasificacion(Clasificacion clasificacion) {
    appendChange(new TipoDeUnaClasificacionCambiada()).apply();
  }

  public void cambiarFechaDeUnaFactura(Fecha fecha) {
    appendChange(new FechaDeUnaFacturaCambiada(fecha)).apply();
  }

  public Set<ProductoId> productos() {
    return this.productos;
  }

  public void Prductos(Set<ProductoId> productos) {
    this.productos = productos;
  }

  public VendedorId getVendedorId() {
    return vendedorId;
  }

  public void setVendedorId(VendedorId vendedorId) {
    this.vendedorId = vendedorId;
  }

}
