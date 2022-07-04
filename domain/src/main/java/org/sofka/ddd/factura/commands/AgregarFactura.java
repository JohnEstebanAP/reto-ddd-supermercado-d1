package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.factura.EstadoFactura;
import org.sofka.ddd.factura.Transaccion;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.producto.values.ProductoId;

import java.util.Set;

public class AgregarFactura extends Command {

    private final FacturaId facturaId;
    private final Set<ProductoId> producto;
    private final EmpleadoId empleadoId;
    private final ClienteId clienteid;
    private final Transaccion transaccion;
    private final EstadoFactura estadoFactura;

    public AgregarFactura(FacturaId facturaId, Set<ProductoId> producto, EmpleadoId empleadoId, ClienteId clienteid, Transaccion transaccion, EstadoFactura estadoFactura) {
        this.facturaId = facturaId;
        this.producto = producto;
        this.empleadoId = empleadoId;
        this.clienteid = clienteid;
        this.transaccion = transaccion;
        this.estadoFactura = estadoFactura;
    }

    public FacturaId entityId(){
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
