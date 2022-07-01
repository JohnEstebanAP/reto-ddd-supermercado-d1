package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.PermisoId;
import org.sofka.ddd.Empleado.values.TipoPermiso;

public class EliminarPermiso extends Command {
    private final PermisoId entityId;
    private final TipoPermiso tipoPermiso;

    public EliminarPermiso(PermisoId entityId) {
        this.entityId = entityId;
        this.tipoPermiso = null;
    }

    public PermisoId entityId() {
        return entityId;
    }

    public TipoPermiso tipoPermiso() {
        return tipoPermiso;
    }
}
