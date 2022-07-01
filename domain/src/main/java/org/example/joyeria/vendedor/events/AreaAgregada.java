package org.example.joyeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.values.AreaId;
import org.example.joyeria.vendedor.values.Nombre;

public class AreaAgregada extends DomainEvent {
    private final AreaId entityId;
    private final Nombre nombre;

    public AreaAgregada(AreaId entityId, Nombre nombre) {
        super("joyeria.area.areacreada");
        this.nombre = nombre;
        this.entityId = entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public AreaId getAreaId() {
        return entityId;
    }
}
