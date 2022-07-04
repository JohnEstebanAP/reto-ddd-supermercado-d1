package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.events.NombreActualizado;
import org.sofka.ddd.empleado.values.NombreEmpleado;
import org.sofka.ddd.producto.events.*;
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

    public void eliminarProducto(ProductoId productoId) {
        Objects.requireNonNull(productoId);
        appendChange(new ProductoEliminado(productoId)).apply();
    }

    public void actualizarUbicacion(Ubicacion ubicacion) {
        Objects.requireNonNull(ubicacion);
        appendChange(new UbicacionActualizada(ubicacion)).apply();
    }

    public void actualizarEstanteria(Ubicacion ubicacion, Estanteria estanteria) {
        Objects.requireNonNull(ubicacion);
        Objects.requireNonNull(estanteria);
        appendChange(new EstanteriaActualizada(ubicacion, estanteria)).apply();
    }

    public void actualizarPasillo(Ubicacion ubicacion, Pasillo pasillo) {
        Objects.requireNonNull(ubicacion);
        Objects.requireNonNull(pasillo);
        appendChange(new PasilloActualizado(ubicacion, pasillo)).apply();
    }

    public void asignarProvedor(Proveedor proveedor) {
        Objects.requireNonNull(proveedor);
        appendChange(new ProveedorAsignado(proveedor)).apply();
    }

    public void actualizarTelefonoProveedor(Proveedor proveedor, TelefonoProveedor telefonoProveedor) {
        Objects.requireNonNull(proveedor);
        Objects.requireNonNull(telefonoProveedor);
        appendChange(new TelefonoProveedorActualizado(proveedor, telefonoProveedor)).apply();
    }

    public void actualizarNombreProveedor(Proveedor proveedor, NombreProveedor nombreProveedor) {
        Objects.requireNonNull(proveedor);
        Objects.requireNonNull(nombreProveedor);
        appendChange(new NombreProveedorActualizado(proveedor, nombreProveedor)).apply();
    }

    public void asignarEstado(EstadoDelProducto estadoDelProducto) {
        Objects.requireNonNull(estadoDelProducto);
        appendChange(new EstadoAsignado(estadoDelProducto)).apply();
    }

    public void actualizarEstadoProducto(EstadoDelProducto estadoDelProducto, EstadoProducto estadoProducto) {
        Objects.requireNonNull(estadoDelProducto);
        Objects.requireNonNull(estadoProducto);
        appendChange(new EstadoProductoActualizado(estadoDelProducto, estadoProducto)).apply();
    }

    public void actualizarCaducidad(EstadoDelProducto estadoDelProducto, Caducidad caducidad) {
        Objects.requireNonNull(estadoDelProducto);
        Objects.requireNonNull(caducidad);
        appendChange(new CaducidadActualizada(estadoDelProducto, caducidad)).apply();
    }

    public void actualizarNombreProducto(NombreProducto nombreProducto) {
        Objects.requireNonNull(nombreProducto);
        appendChange(new NombreProductoActualizado(nombreProducto)).apply();
    }

    public void actualizarNombreMarca(NombreMarca nombreMarca) {
        Objects.requireNonNull(nombreMarca);
        appendChange(new NombreMarcaActualizado(nombreMarca)).apply();
    }

    public void actualizarStock(Stock stock) {
        Objects.requireNonNull(stock);
        appendChange(new StockActualizado(stock)).apply();
    }

    public void cambiarPrecio(Precio precio) {
        Objects.requireNonNull(precio);
        appendChange(new PrecioCambiado(precio)).apply();
    }

}
