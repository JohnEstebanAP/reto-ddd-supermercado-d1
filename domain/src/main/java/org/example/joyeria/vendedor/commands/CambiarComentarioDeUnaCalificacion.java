package org.example.joyeria.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.vendedor.values.CalificacionId;
import org.example.joyeria.vendedor.values.Comentario;
import org.example.joyeria.vendedor.values.VendedorId;

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

