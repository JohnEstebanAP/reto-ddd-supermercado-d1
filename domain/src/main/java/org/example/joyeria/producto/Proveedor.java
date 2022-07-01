package org.example.joyeria.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.producto.values.ProveedorId;

public class Proveedor extends AggregateEvent<ProveedorId> {
    public Proveedor(ProveedorId entityId) {
        super(entityId);
    }
}
