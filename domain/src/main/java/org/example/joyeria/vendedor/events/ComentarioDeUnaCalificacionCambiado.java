package org.example.joyeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.values.CalificacionId;
import org.example.joyeria.vendedor.values.Comentario;

public class ComentarioDeUnaCalificacionCambiado extends DomainEvent {
    private final CalificacionId entityId;
    private final Comentario comentario;

    public ComentarioDeUnaCalificacionCambiado(CalificacionId entityId, Comentario comentario) {
        super("joyeria.calificacion.comentariodeunacalificacioncambiado");
        this.comentario = comentario;
        this.entityId= entityId;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public CalificacionId getCalificacionId() {
        return entityId;
    }
}
