package org.example.joyeria.factura.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ClasificacionAgregada extends DomainEvent {
    public ClasificacionAgregada() {
        super("joyeria.cliente.clasificacionagregada");
    }
}
