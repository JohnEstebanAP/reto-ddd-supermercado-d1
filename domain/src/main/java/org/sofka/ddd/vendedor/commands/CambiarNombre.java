package org.sofka.ddd.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.vendedor.values.Nombre;
import org.sofka.ddd.vendedor.values.VendedorId;

public class CambiarNombre  extends Command {
    private final VendedorId entityId;
    private final Nombre nombre;

    public CambiarNombre(VendedorId entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public VendedorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
