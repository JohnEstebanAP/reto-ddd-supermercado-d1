package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.events.NombreActualizado;
import org.sofka.ddd.empleado.values.NombreEmpleado;
import org.sofka.ddd.producto.events.ProductoActualizado;
import org.sofka.ddd.producto.events.ProductoAgregado;
import org.sofka.ddd.producto.values.*;

import java.util.List;
import java.util.Objects;

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

        appendChange(new ProductoAgregado(entityId, ubicacion, proveedor, estadoDelProducto, nombreProducto, nombreMarca, stock, fechaProducto, fechaCaducidad, fechaIngreso, precio)).apply();
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

    public void actualizarProducto(ProductoId productoId, Ubicacion ubicacion, Proveedor proveedor, org.sofka.ddd.producto.EstadoDelProducto estadoDelProducto, NombreProducto nombreProducto, org.sofka.ddd.producto.values.NombreMarca nombreMarca, Stock stock, FechaProducto fechaProducto, FechaCaducidad fechaCaducidad, FechaIngreso fechaIngreso, Precio precio) {
        appendChange(new ProductoActualizado(productoId, ubicacion, proveedor, estadoDelProducto, nombreProducto, nombreMarca, stock, fechaProducto, fechaCaducidad, fechaIngreso, precio)).apply();
    }
}
