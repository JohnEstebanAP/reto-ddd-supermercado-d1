package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.NombreEmpleado;
import org.sofka.ddd.Empleado.values.EmpleadoId;

public class AgregarArea extends Command {
    private final EmpleadoId vendedorId;
    private final AreaId entityId;
    private final NombreEmpleado nombre;

    public AgregarArea(EmpleadoId vendedorId, AreaId entityId, NombreEmpleado nombre) {
        this.vendedorId = vendedorId;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public EmpleadoId getVendedorId() {
        return vendedorId;
    }

    public AreaId getEntityId() {
        return entityId;
    }

    public NombreEmpleado getNombre() {
        return nombre;
    }
}
