package org.sofka.ddd.cliente;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnClienteActualizado extends DomainEvent {

    private final NombreCliente nombre;
    public NombreDeUnClienteActualizado(NombreCliente nombre) {
        super("joyeria.factura.nombredeclienteactualizado");
        this.nombre = nombre;
    }

    public NombreCliente getNombre() {
        return nombre;
    }
}
