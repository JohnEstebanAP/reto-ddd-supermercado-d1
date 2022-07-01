package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.EmpleadoId;

public class CambiarComentarioDeUnaCalificacion  extends Command {
    private final EmpleadoId vendedorId;
    private final CalificacionId entityId;
    private final Comentario comentario;

    public CambiarComentarioDeUnaCalificacion(EmpleadoId vendedorId, CalificacionId entityId, Comentario comentario) {
        this.vendedorId = vendedorId;
        this.entityId = entityId;
        this.comentario = comentario;
    }

    public EmpleadoId getVendedorId() {
        return vendedorId;
    }

    public CalificacionId getEntityId() {
        return entityId;
    }

    public Comentario getComentario() {
        return comentario;
    }
}

