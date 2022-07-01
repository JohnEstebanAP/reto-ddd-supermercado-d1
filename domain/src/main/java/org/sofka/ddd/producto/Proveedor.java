package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.ddd.producto.values.ProveedorId;

public class Proveedor extends AggregateEvent<ProveedorId> {
    public Proveedor(ProveedorId entityId) {
        super(entityId);
    }
}
