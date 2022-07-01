package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.Documento;
import org.sofka.ddd.Empleado.Permisos;
import org.sofka.ddd.Empleado.TipoDeEmpleado;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.NombreEmpleado;
import org.sofka.ddd.Empleado.values.TelefonoEmpleado;

import java.util.Set;
import java.util.UUID;

public class EmpleadoCreado extends DomainEvent {
    private final EmpleadoId entityId;
    private final NombreEmpleado nombreEmpleado;
    private final TelefonoEmpleado telefonoEmpleado;
    private final Set<Permisos> permisos;
    private final Documento documento;
    private final TipoDeEmpleado tipoEmpleado;

    public EmpleadoCreado(EmpleadoId entityId, NombreEmpleado nombreEmpleado, TelefonoEmpleado telefonoEmpleado, Set<Permisos> permisos, Documento documento, TipoDeEmpleado tipoEmpleado) {
        super("ddd.empleado.empleadocreado");
        this.entityId = entityId;
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.permisos = permisos;
        this.documento = documento;
        this.tipoEmpleado = tipoEmpleado;
    }

    public EmpleadoId entityId() {
        return entityId;
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

    public TipoDeEmpleado tipoEmpleado() {
        return tipoEmpleado;
    }
}
