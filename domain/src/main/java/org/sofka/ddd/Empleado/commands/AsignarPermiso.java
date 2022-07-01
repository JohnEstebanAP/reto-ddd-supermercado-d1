package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.Permisos;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.NombreEmpleado;
import org.sofka.ddd.Empleado.values.PermisoId;
import org.sofka.ddd.Empleado.values.TipoPermiso;

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
