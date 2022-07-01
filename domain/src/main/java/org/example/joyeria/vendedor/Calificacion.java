package org.example.joyeria.vendedor;

import co.com.sofka.domain.generic.Entity;
import org.example.joyeria.vendedor.values.CalificacionId;
import org.example.joyeria.vendedor.values.Comentario;
import org.example.joyeria.vendedor.values.Puntaje;

import java.util.Objects;

public class Calificacion extends Entity<CalificacionId> {

    private Puntaje puntaje;
    private Comentario comentario;

    public Calificacion(CalificacionId entityId, Puntaje puntaje, Comentario comentario) {
        super(entityId);
        this.puntaje = puntaje;
        this.comentario = comentario;
    }

    public void cambiarPuntaje(Puntaje puntaje){
        this.puntaje= Objects.requireNonNull(puntaje);
    }

    public void cambiarComentario(Comentario comentario){
        this.comentario= Objects.requireNonNull(comentario);
    }

    public Puntaje puntaje() {
        return puntaje;
    }

    public Comentario comentario() {
        return comentario;
    }
}
