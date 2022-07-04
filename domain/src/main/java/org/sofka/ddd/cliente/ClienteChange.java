package org.sofka.ddd.cliente;

import co.com.sofka.domain.generic.EventChange;
import org.sofka.ddd.cliente.events.ClienteCreado;
import org.sofka.ddd.cliente.events.NombreClienteAsignado;

public class ClienteChange extends EventChange {
  public ClienteChange(Cliente cliente) {

    apply(
        (ClienteCreado event) -> {
          cliente.crearCliente(event.entityId());
        });


    apply((NombreClienteAsignado event) -> {
          cliente.nombreCliente = event.nombreCliente();
        });
    /*

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

    apply((NombreActualizado event) -> {
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
    */
  }
}
