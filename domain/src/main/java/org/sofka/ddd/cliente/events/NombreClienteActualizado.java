package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.NombreCliente;

public class NombreClienteActualizado extends DomainEvent {

    private final NombreCliente nombreCliente;
    public NombreClienteActualizado(NombreCliente nombreCliente) {
        super("ddd.cliente.nombreclienteactualizado");
        this.nombreCliente = nombreCliente;
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }
}
