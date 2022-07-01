package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.NombreEmpleado;

public class EmpleadoCreado extends DomainEvent {
    private final EmpleadoId entityId;
    private final NombreEmpleado nombre;

    public EmpleadoCreado(EmpleadoId entityId, NombreEmpleado nombre) {
        super("ddd.empleado.empleadocreado");
        this.nombre = nombre;
        this.entityId = entityId;
    }

    public NombreEmpleado getNombre() {
        return nombre;
    }

    public EmpleadoId getVendedorId() {
        return entityId;
    }
}
