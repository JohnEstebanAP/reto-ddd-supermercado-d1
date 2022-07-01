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

    private final EmpleadoId entityId;
    private final NombreEmpleado nombreEmpleado;
    private final TelefonoEmpleado telefonoEmpleado;
    private final Set<Permisos> permisos;
    private final Documento documento;
    private final TipoDeEmpleado tipoDeEmpleado;

    public CrearEmpleado(EmpleadoId entityId, NombreEmpleado nombreEmpleado, TelefonoEmpleado telefonoEmpleado, Set<Permisos> permisos, Documento documento, TipoDeEmpleado tipoDeEmpleado) {
        this.entityId = entityId;
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.permisos = permisos;
        this.documento = documento;
        this.tipoDeEmpleado = tipoDeEmpleado;
    }

    public NombreEmpleado nombreEmpleado() {
        return nombreEmpleado;
    }

    public TelefonoEmpleado telefonoEmpleado() {
        return telefonoEmpleado;
    }

    public Set<Permisos> permisos() {
        return permisos;
    }

    public Documento documento() {
        return documento;
    }

    public TipoDeEmpleado tipoDeEmpleado() {
        return tipoDeEmpleado;
    }

    public EmpleadoId entityId() {
        return entityId;
    }
}
