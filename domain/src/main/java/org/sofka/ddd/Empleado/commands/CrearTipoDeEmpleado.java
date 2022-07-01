package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.Documento;
import org.sofka.ddd.Empleado.Permisos;
import org.sofka.ddd.Empleado.TipoDeEmpleado;
import org.sofka.ddd.Empleado.values.*;

import java.util.Set;

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
