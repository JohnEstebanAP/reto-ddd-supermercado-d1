package org.sofka.ddd.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.vendedor.values.AreaId;
import org.sofka.ddd.vendedor.values.Nombre;

public class NombreDeUnAreaCambiado extends DomainEvent {
    private final AreaId entityId;
    private final Nombre nombre;

    public NombreDeUnAreaCambiado(AreaId entityId, Nombre nombre) {
        super("joyeria.area.nombredeunareacambiado");
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
