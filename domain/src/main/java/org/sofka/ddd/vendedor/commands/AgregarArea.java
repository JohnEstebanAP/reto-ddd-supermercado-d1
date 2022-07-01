package org.sofka.ddd.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.vendedor.values.AreaId;
import org.sofka.ddd.vendedor.values.Nombre;
import org.sofka.ddd.vendedor.values.VendedorId;

public class AgregarArea extends Command {
    private final VendedorId vendedorId;
    private final AreaId entityId;
    private final Nombre nombre;

    public AgregarArea(VendedorId vendedorId, AreaId entityId, Nombre nombre) {
        this.vendedorId = vendedorId;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public AreaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
