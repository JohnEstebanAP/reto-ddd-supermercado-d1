package org.example.joyeria.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.vendedor.values.CalificacionId;
import org.example.joyeria.vendedor.values.Comentario;
import org.example.joyeria.vendedor.values.Puntaje;
import org.example.joyeria.vendedor.values.VendedorId;

public class AgregarCalificacion  extends Command {
    private final VendedorId vendedorId;
    private final CalificacionId entityId;
    private final Puntaje puntaje;
    private final Comentario comentario;

    public AgregarCalificacion(VendedorId vendedorId, CalificacionId entityId, Puntaje puntaje, Comentario comentario) {
        this.vendedorId = vendedorId;
        this.entityId = entityId;
        this.puntaje = puntaje;
        this.comentario = comentario;
    }

    public VendedorId getVendedorId() {
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
