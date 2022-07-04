package org.sofka.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.cliente.values.NombreCliente;


public class AsignarNombreCliente extends Command {

    private ClienteId clienteId;
    private NombreCliente nombreCliente;

    public AsignarNombreCliente(ClienteId clienteId, NombreCliente nombreCliente) {
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }

}
