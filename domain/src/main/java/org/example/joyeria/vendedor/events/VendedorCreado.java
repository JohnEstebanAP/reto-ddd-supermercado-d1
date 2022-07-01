package org.example.joyeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.values.Nombre;
import org.example.joyeria.vendedor.values.VendedorId;

public class VendedorCreado extends DomainEvent {
    private final VendedorId entityId;
    private final Nombre nombre;

    public VendedorCreado(VendedorId entityId, Nombre nombre) {
        super("joyeria.vendedor.vendedorcreado");
        this.nombre = nombre;
        this.entityId = entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public VendedorId getVendedorId() {
        return entityId;
    }
}
