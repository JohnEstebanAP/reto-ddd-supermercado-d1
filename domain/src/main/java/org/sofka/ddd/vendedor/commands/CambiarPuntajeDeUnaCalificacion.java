package org.sofka.ddd.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.vendedor.values.CalificacionId;
import org.sofka.ddd.vendedor.values.Puntaje;
import org.sofka.ddd.vendedor.values.VendedorId;

public class CambiarPuntajeDeUnaCalificacion extends Command {
    private final VendedorId vendedorId;
    private final CalificacionId entityId;
    private final Puntaje puntaje;

    public CambiarPuntajeDeUnaCalificacion(VendedorId vendedorId, CalificacionId entityId, Puntaje puntaje) {
        this.vendedorId = vendedorId;
        this.entityId = entityId;
        this.puntaje = puntaje;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public CalificacionId getEntityId() {
        return entityId;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
