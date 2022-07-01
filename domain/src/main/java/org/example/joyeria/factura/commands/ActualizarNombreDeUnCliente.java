package org.example.joyeria.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.factura.values.ClienteId;
import org.example.joyeria.factura.values.FacturaId;
import org.example.joyeria.factura.values.NombreCliente;

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
