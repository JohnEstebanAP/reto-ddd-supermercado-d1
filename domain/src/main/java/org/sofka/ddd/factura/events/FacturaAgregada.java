package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.Fecha;
import org.sofka.ddd.factura.values.TotalPago;
import org.sofka.ddd.producto.values.ProductoId;

import java.util.Set;

public class FacturaAgregada extends DomainEvent {

    private final FacturaId facturaId;
    protected TotalPago totalPago;
    protected Fecha fecha;
    protected Set<ProductoId> producto;
    protected EmpleadoId empleadoId;
    protected ClienteId clienteid;

    public FacturaAgregada(FacturaId facturaId, TotalPago totalPago, Fecha fecha, Set<ProductoId> producto, EmpleadoId empleadoId, ClienteId clienteid) {
        super("ddd.factura.facturaagregado");
        this.facturaId = facturaId;
        this.totalPago = totalPago;
        this.fecha = fecha;
        this.producto = producto;
        this.empleadoId = empleadoId;
        this.clienteid = clienteid;
    }

    public TotalPago totalPago() {
        return totalPago;
    }

    public Fecha fecha() {
        return fecha;
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
