package org.example.joyeria.factura.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ProductoAsociado extends DomainEvent {
    public ProductoAsociado() {
        super("joyeria.cliente.productoasociado");
    }

}
