package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.Fecha;
import org.sofka.ddd.factura.values.TotalPago;
import org.sofka.ddd.producto.values.ProductoId;

import java.util.Set;

public class FacturaEliminada extends DomainEvent {

    private final FacturaId facturaId;

    public FacturaEliminada(FacturaId facturaId) {
        super("ddd.factura.facturaeliminada");
        this.facturaId = facturaId;
    }

    public FacturaId facturaId() {
        return facturaId;
    }
}
