package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.empleado.values.TelefonoEmpleado;

public class ActualizarTelefono extends Command {

    private final EmpleadoId entityId;

    private final TelefonoEmpleado telefonoEmpleado;

    public ActualizarTelefono(EmpleadoId entityId, TelefonoEmpleado telefonoEmpleado) {
        this.entityId = entityId;
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public EmpleadoId entityId() {
        return entityId;
    }

    public TelefonoEmpleado telefonoEmpleado() {
        return telefonoEmpleado;
    }
}
