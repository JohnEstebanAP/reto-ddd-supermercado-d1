package org.sofka.ddd.Empleado;

import co.com.sofka.domain.generic.EventChange;
import org.sofka.ddd.Empleado.events.*;

import java.util.HashSet;

public class EmpleadoChange extends EventChange {
    public EmpleadoChange(Empleado vendedor) {
        apply((VendedorCreado event) -> {
            vendedor.nombre = event.getNombre();
            vendedor.calificaciones = new HashSet<>();
        });

        apply((AreaAgregada event)->{
            vendedor.agregarArea(event.getAreaId(),event.getNombre());
        });

        apply((CalificacionAgregada event) -> {
            vendedor.calificaciones.add(new Calificacion(
                    event.getCalificacionId(),
                    event.getPuntaje(),
                    event.getComentario()
            ));
        });

        apply((ComentarioDeUnaCalificacionCambiado event) -> {
            var calificacion = vendedor.getCalificacionPorId(event.getCalificacionId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la calificacion del vendedor"));
            calificacion.cambiarComentario(event.getComentario());
        });

        apply((NombreCambiado event) -> {
            vendedor.nombre = event.getNombre();
        });

        apply((NombreDeUnAreaCambiado event) -> {
            vendedor.cambiarNombreDeUnArea(event.getAreaId(), event.getNombre());
        });

        apply((PuntajeDeUnaCalificacionCambiado event) -> {
            var calificacion = vendedor.getCalificacionPorId(event.getCalificacionId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la calificacion del vendedor"));
            calificacion.cambiarPuntaje(event.getPuntaje());
        });
    }

}
