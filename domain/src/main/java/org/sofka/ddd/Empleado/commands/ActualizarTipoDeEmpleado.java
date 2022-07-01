package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.TipoDeEmpleadoId;
import org.sofka.ddd.Empleado.values.TipoEmpleado;

public class ActualizarTipoDeEmpleado extends Command {

    private final TipoDeEmpleadoId entityId;
    private final TipoEmpleado tipoEmpleado;

    public ActualizarTipoDeEmpleado(TipoDeEmpleadoId entityId, TipoEmpleado tipoEmpleado) {
        this.entityId = entityId;
        this.tipoEmpleado = tipoEmpleado;
    }

    public TipoDeEmpleadoId entityId() {
        return entityId;
    }

    public TipoEmpleado tipoEmpleado() {
        return tipoEmpleado;
    }
}
