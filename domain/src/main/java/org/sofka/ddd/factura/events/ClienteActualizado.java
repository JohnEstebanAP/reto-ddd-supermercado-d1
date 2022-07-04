package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.factura.values.FacturaId;

public class ClienteActualizado extends DomainEvent {

    protected ClienteId clienteId;

    public ClienteActualizado(FacturaId facturaId, ClienteId clienteId) {
        super("ddd.factura.facturaagregado");
        this.clienteId = clienteId;
    }

    public ClienteId cliente() {
        return clienteId;
    }

}
