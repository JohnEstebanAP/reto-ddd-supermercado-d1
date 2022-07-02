package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.empleado.values.NombreEmpleado;

public class ActualizarNombre extends Command {
    private final EmpleadoId entityId;
    private final NombreEmpleado nombre;

    public ActualizarNombre(EmpleadoId entityId, NombreEmpleado nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public EmpleadoId entityId() {
        return entityId;
    }

    public NombreEmpleado nombre() {
        return nombre;
    }
}
