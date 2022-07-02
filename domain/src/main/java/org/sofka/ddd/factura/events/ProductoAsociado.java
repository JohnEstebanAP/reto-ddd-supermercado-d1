package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.producto.values.ProductoId;

public class ProductoAsociado extends DomainEvent {

    private final FacturaId facturaId;
    private final ProductoId ProductoId;

    public ProductoAsociado(FacturaId facturaId, ProductoId productoId) {
        super("ddd.factura.productoAsociado");
        this.facturaId = facturaId;
        ProductoId = productoId;
    }
}
