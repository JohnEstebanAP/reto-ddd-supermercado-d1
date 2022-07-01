package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.EmpleadoId;

public class CambiarPuntajeDeUnaCalificacion extends Command {
    private final EmpleadoId vendedorId;
    private final CalificacionId entityId;
    private final Puntaje puntaje;

    public CambiarPuntajeDeUnaCalificacion(EmpleadoId vendedorId, CalificacionId entityId, Puntaje puntaje) {
        this.vendedorId = vendedorId;
        this.entityId = entityId;
        this.puntaje = puntaje;
    }

    public EmpleadoId getVendedorId() {
        return vendedorId;
    }

    public CalificacionId getEntityId() {
        return entityId;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
