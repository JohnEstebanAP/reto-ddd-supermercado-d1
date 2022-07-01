package org.example.joyeria.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.factura.values.NombreCliente;

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
