package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.producto.commands.AgregarProducto;
import org.sofka.ddd.producto.events.productoAgregado;
import org.sofka.ddd.producto.values.*;

import java.util.List;

public class Producto extends AggregateEvent<ProductoId> {

    Ubicacion ubicacion;
    Proveedor proveedor;
    EstadoDelProducto estadoDelProducto;

    NombreProducto nombreProducto;
    NombreMarca nombreMarca;
    protected Stock stock;
    FechaProducto fechaProducto;
    FechaCaducidad fechaCaducidad;
    FechaIngreso fechaIngreso;
    protected Precio precio;


    public Producto(ProductoId entityId, Ubicacion ubicacion, Proveedor proveedor, org.sofka.ddd.producto.EstadoDelProducto estadoDelProducto, NombreProducto nombreProducto, org.sofka.ddd.producto.values.NombreMarca nombreMarca, Stock stock, FechaProducto fechaProducto, FechaCaducidad fechaCaducidad, FechaIngreso fechaIngreso, Precio precio) {
        super(entityId);
        this.ubicacion = ubicacion;
        this.proveedor = proveedor;
        this.estadoDelProducto = estadoDelProducto;
        this.nombreProducto = nombreProducto;
        this.nombreMarca = nombreMarca;
        this.stock = stock;
        this.fechaProducto = fechaProducto;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaIngreso = fechaIngreso;
        this.precio = precio;

        appendChange(new productoAgregado(entityId, ubicacion, proveedor, estadoDelProducto, nombreProducto, nombreMarca, stock, fechaProducto, fechaCaducidad, fechaIngreso, precio)).apply();
    }

    private Producto(ProductoId entityId) {
        super(entityId);
        subscribe(new ProductoChange(this));
    }

    public static Producto from(ProductoId productoId, List<DomainEvent> events) {
        var producto = new Producto(productoId);
        events.forEach(producto::applyEvent);
        return producto;
    }
}
