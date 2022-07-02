package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.empleado.values.NombreEmpleado;

public class NombreActualizado extends DomainEvent {
    private final NombreEmpleado nombre;


    public NombreActualizado(NombreEmpleado nombre) {
        super("ddd.empleado.nombreactualizado");
        this.nombre = nombre;
    }

    public String nombreEmpleado() {
        return nombre.value();
    }
}
