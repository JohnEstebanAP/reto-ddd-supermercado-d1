package org.example.joyeria.vendedor;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.events.*;
import org.example.joyeria.vendedor.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Vendedor extends AggregateEvent<VendedorId> {
    protected Nombre nombre;
    protected Set<Calificacion> calificaciones;
    protected AreaId areaId;

    public Vendedor(VendedorId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new VendedorCreado(entityId, nombre)).apply();
    }

    private Vendedor(VendedorId entityId) {
        super(entityId);
        subscribe(new VendedorChange(this));
    }

    public static Vendedor from(VendedorId vendedorId, List<DomainEvent> events){
        var vendedor= new Vendedor(vendedorId);
        events.forEach(vendedor::applyEvent);
        return vendedor;
    }

    public void agregarArea(AreaId entityId, Nombre nombre) {
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

    public void cambiarNombre(VendedorId entityId, Nombre nombre){
        appendChange(new NombreCambiado(entityId,nombre)).apply();
    }

    public void cambiarNombreDeUnArea(AreaId entityId, Nombre nombre) {
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



    public Nombre nombre() {
        return nombre;
    }

    public AreaId areaId() {
        return areaId;
    }

    public Set<Calificacion> calificaciones() {
        return calificaciones;
    }
}
