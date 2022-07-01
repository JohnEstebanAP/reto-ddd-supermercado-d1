package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.TelefonoEmpleado;
import org.sofka.ddd.Empleado.values.TipoDeEmpleadoId;
import org.sofka.ddd.Empleado.values.TipoEmpleado;

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
