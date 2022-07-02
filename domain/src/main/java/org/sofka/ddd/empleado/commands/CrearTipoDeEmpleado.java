package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.values.*;
import org.sofka.ddd.empleado.values.ids.TipoDeEmpleadoId;

public class CrearTipoDeEmpleado extends Command {

    private final TipoDeEmpleadoId entityId;
    private final TipoEmpleado tipoEmpleado;

    public CrearTipoDeEmpleado(TipoDeEmpleadoId entityId, TipoEmpleado tipoEmpleado) {
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
