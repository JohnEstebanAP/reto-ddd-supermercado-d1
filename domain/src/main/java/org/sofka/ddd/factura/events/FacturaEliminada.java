package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.factura.values.FacturaId;

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
