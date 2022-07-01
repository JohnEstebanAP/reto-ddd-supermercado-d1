package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.Documento;
import org.sofka.ddd.Empleado.Permisos;
import org.sofka.ddd.Empleado.TipoDeEmpleado;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.NombreEmpleado;
import org.sofka.ddd.Empleado.values.TelefonoEmpleado;

import java.util.Set;

public class CrearEmpleado extends Command {

    protected NombreEmpleado nombreEmpleado;
    protected TelefonoEmpleado telefonoEmpleado;
    protected Set<Permisos> permisos;
    protected Documento documento;
    protected TipoDeEmpleado tipoEmpleado;

    public CrearEmpleado(EmpleadoId entityId, NombreEmpleado nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public EmpleadoId getEntityId() {
        return entityId;
    }

    public NombreEmpleado getNombre() {
        return nombre;
    }
}
