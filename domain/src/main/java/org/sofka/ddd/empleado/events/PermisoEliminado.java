package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.entitys.Permisos;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.empleado.values.ids.PermisoId;

import java.util.Set;

public class PermisoEliminado extends DomainEvent {

    private final PermisoId permisoId;

    public PermisoEliminado(PermisoId permisoId) {
        super("ddd.empleado.permisoEliminado");
        this.permisoId = permisoId;
    }

    public PermisoId permisoId() {
        return permisoId;
    }
}
