package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.empleado.values.NombreEmpleado;

public class CambiarNombre  extends Command {
    private final EmpleadoId entityId;
    private final NombreEmpleado nombre;

    public CambiarNombre(EmpleadoId entityId, NombreEmpleado nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public EmpleadoId getEntityId() {
        return entityId;
    }

    public NombreEmpleado getNombre() {
        return nombre;
    }
}
