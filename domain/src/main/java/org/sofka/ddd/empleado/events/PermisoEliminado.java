package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.entitys.Permisos;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;

import java.util.Set;

public class PermisoEliminado extends DomainEvent {
    private final EmpleadoId entityId;
    private final Set<Permisos> permisos;

    public PermisoEliminado(EmpleadoId entityId, Set<Permisos> permisos) {
        super("ddd.empleado.permisoEliminado");
        this.entityId = entityId;
        this.permisos = permisos;
    }

    public Set<Permisos> permisos() {
        return permisos;
    }

    public EmpleadoId empleadoId() {
        return entityId;
    }
}
