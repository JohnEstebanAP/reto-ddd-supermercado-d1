package org.example.joyeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.values.Nombre;
import org.example.joyeria.vendedor.values.VendedorId;

public class NombreCambiado extends DomainEvent {
    private final VendedorId entityId;
    private final Nombre nombre;


    public NombreCambiado(VendedorId entityId, Nombre nombre) {
        super("joyeria.vendedor.nombrecambiado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public VendedorId getVendedorId() {
        return entityId;
    }
}
