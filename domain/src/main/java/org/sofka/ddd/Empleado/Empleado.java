package org.sofka.ddd.Empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.events.*;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.NombreEmpleado;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Empleado extends AggregateEvent<EmpleadoId> {
    protected NombreEmpleado nombre;
    protected Set<Calificacion> calificaciones;


    public Empleado(EmpleadoId entityId, NombreEmpleado nombre) {
        super(entityId);
        appendChange(new VendedorCreado(entityId, nombre)).apply();
    }

    private Empleado(EmpleadoId entityId) {
        super(entityId);
        subscribe(new VendedorChange(this));
    }

    public static Empleado from(EmpleadoId vendedorId, List<DomainEvent> events){
        var vendedor= new Empleado(vendedorId);
        events.forEach(vendedor::applyEvent);
        return vendedor;
    }

    public void agregarArea(AreaId entityId, NombreEmpleado nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AreaAgregada(entityId, nombre)).apply();
    }

    public void agregarCalificacion(CalificacionId entityId, Puntaje puntaje, Comentario comentario) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(puntaje);
        Objects.requireNonNull(comentario);
        appendChange(new CalificacionAgregada(entityId, puntaje, comentario)).apply();
    }

    public void cambiarComentarioDeUnaCalificacion(CalificacionId entityId, Comentario comentario) {
        appendChange(new ComentarioDeUnaCalificacionCambiado(entityId, comentario)).apply();
    }

    public void cambiarNombre(EmpleadoId entityId, NombreEmpleado nombre){
        appendChange(new NombreCambiado(entityId,nombre)).apply();
    }

    public void cambiarNombreDeUnArea(AreaId entityId, NombreEmpleado nombre) {
        appendChange(new NombreDeUnAreaCambiado(entityId, nombre)).apply();
    }

    protected Optional<Calificacion> getCalificacionPorId(CalificacionId calificacionId) {
        return calificaciones()
                .stream()
                .filter(calificacion -> calificacion.identity().equals(calificacionId))
                .findFirst();
    }

    public void cambiarPuntajeDeUnaCalificacion(CalificacionId entityId, Puntaje puntaje) {
        appendChange(new PuntajeDeUnaCalificacionCambiado(entityId, puntaje)).apply();
    }



    public NombreEmpleado nombre() {
        return nombre;
    }

    public AreaId areaId() {
        return areaId;
    }

    public Set<Calificacion> calificaciones() {
        return calificaciones;
    }
}
