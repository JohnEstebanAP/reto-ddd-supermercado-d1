package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.values.ClienteId;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.NombreCliente;

public class ActualizarNombreDeUnCliente extends Command {

    private final FacturaId facturaId;
    private final ClienteId clienteId;

    private final NombreCliente nombreCliente;

    public ActualizarNombreDeUnCliente(FacturaId facturaId, ClienteId clienteId, NombreCliente nombreCliente ){
        this.facturaId = facturaId;
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }
}
