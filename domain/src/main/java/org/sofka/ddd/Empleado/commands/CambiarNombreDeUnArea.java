package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.NombreEmpleado;
import org.sofka.ddd.Empleado.values.EmpleadoId;

public class CambiarNombreDeUnArea extends Command {
    private final EmpleadoId vendedorId;
    private final NombreEmpleado nombre;
    private final AreaId entityId;


    public CambiarNombreDeUnArea(NombreEmpleado nombre, AreaId entityId, EmpleadoId vendedorId) {
        this.nombre = nombre;
        this.entityId = entityId;
        this.vendedorId = vendedorId;
    }

    public NombreEmpleado getNombre() {
        return nombre;
    }

    public AreaId getEntityId() {
        return entityId;
    }

    public EmpleadoId getVendedorId() {
        return vendedorId;
    }
}
