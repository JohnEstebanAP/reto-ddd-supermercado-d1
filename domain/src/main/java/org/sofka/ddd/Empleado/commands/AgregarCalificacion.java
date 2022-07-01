package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.EmpleadoId;

public class AgregarCalificacion  extends Command {
    private final EmpleadoId vendedorId;
    private final CalificacionId entityId;
    private final Puntaje puntaje;
    private final Comentario comentario;

    public AgregarCalificacion(EmpleadoId vendedorId, CalificacionId entityId, Puntaje puntaje, Comentario comentario) {
        this.vendedorId = vendedorId;
        this.entityId = entityId;
        this.puntaje = puntaje;
        this.comentario = comentario;
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

    public Comentario getComentario() {
        return comentario;
    }
}
