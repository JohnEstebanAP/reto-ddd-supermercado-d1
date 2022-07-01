package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.PermisoId;
import org.sofka.ddd.Empleado.values.TipoPermiso;

public class ActualizarPermiso extends Command {
    private final PermisoId entityId;
    private final TipoPermiso tipoPermiso;

    public ActualizarPermiso(PermisoId entityId, TipoPermiso tipoPermiso) {
        this.entityId = entityId;
        this.tipoPermiso = tipoPermiso;
    }

    public PermisoId entityId() {
        return entityId;
    }

    public TipoPermiso tipoPermiso() {
        return tipoPermiso;
    }
}
