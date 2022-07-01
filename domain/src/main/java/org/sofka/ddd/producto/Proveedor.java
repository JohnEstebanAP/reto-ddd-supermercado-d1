package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.ddd.producto.values.NombreProveedor;
import org.sofka.ddd.producto.values.ProveedorId;
import org.sofka.ddd.producto.values.TelefonoProveedor;

public class Proveedor extends AggregateEvent<ProveedorId> {

    protected TelefonoProveedor telefonoProveedor;
    protected NombreProveedor nombreProveedor;

    public Proveedor(ProveedorId entityId, TelefonoProveedor telefonoProveedor, NombreProveedor nombreProveedor) {
        super(entityId);
        this.telefonoProveedor = telefonoProveedor;
        this.nombreProveedor = nombreProveedor;
    }

    public void actualizarTelefonoProveedor(TelefonoProveedor telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public void actualizarNombreProveedor(NombreProveedor nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
}
