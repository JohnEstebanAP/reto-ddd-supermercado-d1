package org.sofka.ddd.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.vendedor.values.CalificacionId;
import org.sofka.ddd.vendedor.values.Comentario;
import org.sofka.ddd.vendedor.values.VendedorId;

public class CambiarComentarioDeUnaCalificacion  extends Command {
    private final VendedorId vendedorId;
    private final CalificacionId entityId;
    private final Comentario comentario;

    public CambiarComentarioDeUnaCalificacion(VendedorId vendedorId, CalificacionId entityId, Comentario comentario) {
        this.vendedorId = vendedorId;
        this.entityId = entityId;
        this.comentario = comentario;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public CalificacionId getEntityId() {
        return entityId;
    }

    public Comentario getComentario() {
        return comentario;
    }
}

