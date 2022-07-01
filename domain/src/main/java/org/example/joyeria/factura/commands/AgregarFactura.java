package org.example.joyeria.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.factura.values.ClienteId;
import org.example.joyeria.factura.values.FacturaId;
import org.example.joyeria.factura.values.NombreCliente;

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
