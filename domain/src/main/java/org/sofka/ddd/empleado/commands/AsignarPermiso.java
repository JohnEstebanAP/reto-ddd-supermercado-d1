package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.values.ids.PermisoId;
import org.sofka.ddd.empleado.values.TipoPermiso;

public class AsignarPermiso extends Command {
    private final PermisoId entityId;
    private final TipoPermiso tipoPermiso;

    public AsignarPermiso(PermisoId entityId, TipoPermiso tipoPermiso) {
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
