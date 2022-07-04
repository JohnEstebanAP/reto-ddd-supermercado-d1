package org.sofka.ddd.factura.commands;


import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.factura.values.FacturaId;

public class ActualizarCliente extends Command {

    private final FacturaId facturaId;
    private final ClienteId clienteId;

    public ActualizarCliente(FacturaId facturaId, ClienteId clienteId) {
        this.facturaId = facturaId;
        this.clienteId = clienteId;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public ClienteId cliente() {
        return clienteId;
    }

}
