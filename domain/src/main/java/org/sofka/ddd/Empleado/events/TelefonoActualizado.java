package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.TelefonoEmpleado;

public class TelefonoActualizado extends DomainEvent {
    private final EmpleadoId entityId;
    private final TelefonoEmpleado telefonoEmpleado;

    public TelefonoActualizado(EmpleadoId entityId, TelefonoEmpleado telefonoEmpleado) {
        super("ddd.empleado.telefonoactualizado");
        this.entityId = entityId;
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public TelefonoEmpleado telefonoEmpleado() {
        return telefonoEmpleado;
    }

    public EmpleadoId empleadoId() {
        return entityId;
    }
}
