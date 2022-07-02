package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.cliente.values.NombreCliente;
import org.sofka.ddd.factura.values.FacturaId;

public class ActualizarNombreDeUnCliente extends Command {

    private final FacturaId facturaId;
    private final ClienteId clienteId;

    private final NombreCliente nombreCliente;

    public ActualizarNombreDeUnCliente(FacturaId facturaId, ClienteId clienteId, NombreCliente nombreCliente ){
        this.facturaId = facturaId;
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }
}
