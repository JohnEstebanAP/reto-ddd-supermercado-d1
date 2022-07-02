package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.EventChange;

public class ProductoChange extends EventChange {
  public ProductoChange(Producto empleado) {
/*
      apply(
              (EmpleadoCreado event) -> {
                  empleado.nombreEmpleado(event.nombreEmpleado());
                  empleado.telefonoEmpleado(event.telefonoEmpleado());
                  empleado.permisos(event.permisos());
                  empleado.documento(event.documento());
                  empleado.tipoDeEmpleado(event.tipoEmpleado());
              });
*/

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
