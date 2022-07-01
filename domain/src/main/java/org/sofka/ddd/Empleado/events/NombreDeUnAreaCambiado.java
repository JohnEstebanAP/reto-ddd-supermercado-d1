package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.values.NombreEmpleado;

public class NombreDeUnAreaCambiado extends DomainEvent {
    private final AreaId entityId;
    private final NombreEmpleado nombre;

    public NombreDeUnAreaCambiado(AreaId entityId, NombreEmpleado nombre) {
        super("joyeria.area.nombredeunareacambiado");
        this.nombre = nombre;
        this.entityId = entityId;
    }

    public NombreEmpleado getNombre() {
        return nombre;
    }

    public AreaId getAreaId() {
        return entityId;
    }
}
