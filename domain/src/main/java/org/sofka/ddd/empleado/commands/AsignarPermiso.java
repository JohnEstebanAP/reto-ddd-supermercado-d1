package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.entitys.Permisos;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.empleado.values.ids.PermisoId;
import org.sofka.ddd.empleado.values.TipoPermiso;

public class AsignarPermiso extends Command {
    private final EmpleadoId entityId;
    private final Permisos permiso;

    public AsignarPermiso(EmpleadoId entityId, Permisos permiso) {
        this.entityId = entityId;
        this.permiso  = permiso;
    }

    public EmpleadoId entityId() {
        return entityId;
    }
   public Permisos permiso() {
        return permiso;
    }

}
