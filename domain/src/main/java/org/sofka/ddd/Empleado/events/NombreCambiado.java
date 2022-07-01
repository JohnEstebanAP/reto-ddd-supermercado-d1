package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.NombreEmpleado;

public class NombreCambiado extends DomainEvent {
    private final EmpleadoId entityId;
    private final NombreEmpleado nombre;


    public NombreCambiado(EmpleadoId entityId, NombreEmpleado nombre) {
        super("joyeria.vendedor.nombrecambiado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public NombreEmpleado getNombre() {
        return nombre;
    }

    public EmpleadoId getVendedorId() {
        return entityId;
    }
}
