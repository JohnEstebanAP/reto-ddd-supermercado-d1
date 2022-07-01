package org.sofka.ddd.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.vendedor.values.CalificacionId;
import org.sofka.ddd.vendedor.values.Comentario;
import org.sofka.ddd.vendedor.values.Puntaje;

public class CalificacionAgregada extends DomainEvent {
    private final CalificacionId entityId;
    private final Puntaje puntaje;
    private final Comentario comentario;

    public CalificacionAgregada(CalificacionId entityId, Puntaje puntaje, Comentario comentario) {
        super("joyeria.calificacion.calificacioncreada");
        this.entityId = entityId;
        this.puntaje = puntaje;
        this.comentario = comentario;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public CalificacionId getCalificacionId() {
        return entityId;
    }
}
