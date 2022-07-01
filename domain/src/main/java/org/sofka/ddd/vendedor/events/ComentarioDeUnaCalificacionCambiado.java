package org.sofka.ddd.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.vendedor.values.CalificacionId;
import org.sofka.ddd.vendedor.values.Comentario;

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
