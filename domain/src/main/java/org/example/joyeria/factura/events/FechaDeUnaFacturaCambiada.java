package org.example.joyeria.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.factura.values.Fecha;

public class FechaDeUnaFacturaCambiada extends DomainEvent {

    private final Fecha fecha;
    public FechaDeUnaFacturaCambiada(Fecha fecha) {
        super("joyeria.cliente.fechadeunafacteracambiada");
        this.fecha = fecha;
    }
}
