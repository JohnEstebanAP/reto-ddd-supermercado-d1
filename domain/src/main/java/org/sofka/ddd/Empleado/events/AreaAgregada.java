package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.values.NombreEmpleado;

public class AreaAgregada extends DomainEvent {
    private final AreaId entityId;
    private final NombreEmpleado nombre;

    public AreaAgregada(AreaId entityId, NombreEmpleado nombre) {
        super("joyeria.area.areacreada");
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
