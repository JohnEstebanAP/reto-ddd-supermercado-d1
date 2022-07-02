package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.factura.values.FacturaId;

public class VendedorActualizado extends DomainEvent {

    protected FacturaId facturaId;
    protected EmpleadoId empleadoId;


    public VendedorActualizado(FacturaId facturaId, EmpleadoId empleadoId) {
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
