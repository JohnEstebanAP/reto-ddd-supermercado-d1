package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.values.ClienteId;
import org.sofka.ddd.factura.values.FacturaId;

public class AgregarFactura extends Command {

    private final FacturaId entityId;

    private final ClienteId clienteId;

    public AgregarFactura (FacturaId entityId, ClienteId clienteId){
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
