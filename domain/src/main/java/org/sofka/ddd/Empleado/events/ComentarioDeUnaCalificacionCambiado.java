package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

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
