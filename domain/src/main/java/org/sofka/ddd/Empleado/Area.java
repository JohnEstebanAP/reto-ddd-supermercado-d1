package org.sofka.ddd.Empleado;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.Empleado.values.NombreEmpleado;

import java.util.Objects;

public class Area extends Entity<AreaId> {
    private NombreEmpleado nombre;

    public Area(AreaId entityId, NombreEmpleado nombre) {
        super(entityId);

        this.nombre = nombre;
    }

    public void cambiarNombre(NombreEmpleado nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public NombreEmpleado Nombre() {
        return nombre;
    }
}
