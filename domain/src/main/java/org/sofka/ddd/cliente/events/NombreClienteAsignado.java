package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.values.NombreCliente;


public class NombreClienteAsignado extends DomainEvent {

    private final NombreCliente nombreCliente;

    public NombreClienteAsignado(NombreCliente nombreCliente) {
        super("ddd.cliente.nombreclienteasignado");
        this.nombreCliente = nombreCliente;
    }


    public NombreCliente nombreCliente() {
        return nombreCliente;
    }

}
