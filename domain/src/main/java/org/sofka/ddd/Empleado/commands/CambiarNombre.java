package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.NombreEmpleado;
import org.sofka.ddd.Empleado.values.EmpleadoId;

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
