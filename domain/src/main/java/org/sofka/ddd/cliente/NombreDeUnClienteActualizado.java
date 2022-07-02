package org.sofka.ddd.cliente;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnClienteActualizado extends DomainEvent {

    public NombreDeUnClienteActualizado(String type) {
        super(type);
    }
}
