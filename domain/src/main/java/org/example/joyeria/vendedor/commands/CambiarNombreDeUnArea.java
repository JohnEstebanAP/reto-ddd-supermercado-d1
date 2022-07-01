package org.example.joyeria.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.vendedor.values.AreaId;
import org.example.joyeria.vendedor.values.Nombre;
import org.example.joyeria.vendedor.values.VendedorId;

public class CambiarNombreDeUnArea extends Command {
    private final VendedorId vendedorId;
    private final Nombre nombre;
    private final AreaId entityId;


    public CambiarNombreDeUnArea(Nombre nombre, AreaId entityId, VendedorId vendedorId) {
        this.nombre = nombre;
        this.entityId = entityId;
        this.vendedorId = vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public AreaId getEntityId() {
        return entityId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
