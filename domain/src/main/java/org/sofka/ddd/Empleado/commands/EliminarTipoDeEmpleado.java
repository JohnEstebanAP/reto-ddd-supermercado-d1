package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.TipoDeEmpleadoId;
import org.sofka.ddd.Empleado.values.TipoEmpleado;

public class EliminarTipoDeEmpleado extends Command {

    private final TipoDeEmpleadoId entityId;
    private final TipoEmpleado tipoEmpleado;

    public EliminarTipoDeEmpleado(TipoDeEmpleadoId entityId) {
        this.entityId = entityId;
        this.tipoEmpleado = null;
    }

    public TipoDeEmpleadoId entityId() {
        return entityId;
    }

    public TipoEmpleado tipoEmpleado() {
        return tipoEmpleado;
    }
}
