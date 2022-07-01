package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.ddd.producto.values.*;

public class EstadoDelProducto extends AggregateEvent<EstadoDelProductoId> {

    protected EstadoProducto estadoProducto;
    protected Caducidad caducidad;

    public EstadoDelProducto(EstadoDelProductoId entityId, EstadoProducto estadoProducto, Caducidad caducidad) {
        super(entityId);
        this.estadoProducto = estadoProducto;
        this.caducidad = caducidad;
    }

    public void actualizarEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public void actualizarCaducidad(Caducidad caducidad) {
        this.caducidad = caducidad;
    }
}
