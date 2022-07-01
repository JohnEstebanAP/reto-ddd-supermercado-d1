package org.example.joyeria.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.factura.values.ClienteId;
import org.example.joyeria.factura.values.FacturaId;

public class FacturaAgregada extends DomainEvent {

    private final FacturaId entityId;
    private final ClienteId clienteId;
    public FacturaAgregada(FacturaId entityId, ClienteId clienteId) {
        super("joyeria.factura.facturaagregada");
        this.entityId = entityId;
        this.clienteId = clienteId;
    }

    public FacturaId getEntityId() {
        return entityId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
