package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.Documento;
import org.sofka.ddd.empleado.Permisos;
import org.sofka.ddd.empleado.TipoDeEmpleado;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.empleado.values.NombreEmpleado;
import org.sofka.ddd.empleado.values.TelefonoEmpleado;

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
