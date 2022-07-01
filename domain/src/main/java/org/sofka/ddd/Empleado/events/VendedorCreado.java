package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.NombreEmpleado;

public class VendedorCreado extends DomainEvent {
    private final EmpleadoId entityId;
    private final NombreEmpleado nombre;

    public VendedorCreado(EmpleadoId entityId, NombreEmpleado nombre) {
        super("joyeria.vendedor.vendedorcreado");
        this.nombre = nombre;
        this.entityId = entityId;
    }

    public NombreEmpleado getNombre() {
        return nombre;
    }

    public EmpleadoId getVendedorId() {
        return entityId;
    }
}
