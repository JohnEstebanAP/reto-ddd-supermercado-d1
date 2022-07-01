package org.sofka.ddd.Empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.events.*;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.NombreEmpleado;
import org.sofka.ddd.Empleado.values.TelefonoEmpleado;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Empleado extends AggregateEvent<EmpleadoId> {

    protected NombreEmpleado nombreEmpleado;
    protected TelefonoEmpleado telefonoEmpleado;
    protected Set<Permisos> permisos;
    protected Documento documento;
    protected TipoDeEmpleado tipoEmpleado;

    public Empleado(EmpleadoId entityId, NombreEmpleado nombre) {
        super(entityId);
        appendChange(new EmpleadoCreado(entityId, nombre)).apply();
    }

    private Empleado(EmpleadoId entityId) {
        super(entityId);
        subscribe(new EmpleadoChange(this));
    }

    public static Empleado from(EmpleadoId empleadoId, List<DomainEvent> events){
        var empleado= new Empleado(empleadoId);
        events.forEach(empleado::applyEvent);
        return empleado;
    }

    public void actualizarNombre(EmpleadoId entityId, NombreEmpleado nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreActualizado(entityId,nombre)).apply();
    }

    public void actualizarTelefono(EmpleadoId entityId, TelefonoEmpleado telefonoEmpleado){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(telefonoEmpleado);
        appendChange(new NombreActualizado(entityId,nombre)).apply();
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
        return nombreEmpleado;
    }

}
