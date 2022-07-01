package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.ddd.producto.values.Precio;
import org.sofka.ddd.producto.values.ProductoId;
import org.sofka.ddd.producto.values.Stock;

public class Producto extends AggregateEvent<ProductoId> {
    protected Stock stock;
    protected Precio precio;
    protected Material material;
    protected Proveedor proveedor;

    public Producto(ProductoId id, Material material, Proveedor proveedor, Stock stock, Precio precio) {
        super(id);

    }
}
