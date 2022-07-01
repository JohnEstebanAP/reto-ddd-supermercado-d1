package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.empleado.values.NombreEmpleado;

public class NombreActualizado extends DomainEvent {
    private final EmpleadoId entityId;
    private final NombreEmpleado nombre;


    public NombreActualizado(EmpleadoId entityId, NombreEmpleado nombre) {
        super("ddd.empleado.nombreactualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public NombreEmpleado nombreEmpleado() {
        return nombre;
    }

    public EmpleadoId empleadoId() {
        return entityId;
    }
}
