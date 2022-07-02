package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.factura.values.FacturaId;

public class VendedorAsociado extends DomainEvent {

    protected FacturaId facturaId;
    protected EmpleadoId empleadoId;


    public VendedorAsociado(FacturaId facturaId, EmpleadoId empleadoId) {
        super("ddd.factura.facturaagregado");
        this.facturaId = facturaId;
        this.empleadoId = empleadoId;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
    }
}
