package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.EstadoDelProducto;
import org.sofka.ddd.producto.Proveedor;
import org.sofka.ddd.producto.Ubicacion;
import org.sofka.ddd.producto.values.*;

public class AgregarProducto extends Command {

   private final ProductoId productoId;
   private final Ubicacion ubicacion;
   private final Proveedor proveedor;
   private final EstadoDelProducto estadoDelProducto;

   private final NombreProducto nombreProducto;
   private final NombreMarca nombreMarca;
   private final Stock stock;
   private final FechaProducto fechaProducto;
   private final FechaCaducidad fechaCaducidad;
   private final FechaIngreso fechaIngreso;
   private final Precio precio;


    public AgregarProducto(ProductoId entityId, Ubicacion ubicacion, Proveedor proveedor, EstadoDelProducto estadoDelProducto, NombreProducto nombreProducto, NombreMarca nombreMarca, Stock stock, FechaProducto fechaProducto, FechaCaducidad fechaCaducidad, FechaIngreso fechaIngreso, Precio precio) {
        this.productoId = entityId;
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
    }


    public ProductoId getProductoId() {
        return productoId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public EstadoDelProducto getEstadoDelProducto() {
        return estadoDelProducto;
    }

    public NombreProducto getNombreProducto() {
        return nombreProducto;
    }

    public NombreMarca getNombreMarca() {
        return nombreMarca;
    }

    public Stock getStock() {
        return stock;
    }

    public FechaProducto getFechaProducto() {
        return fechaProducto;
    }

    public FechaCaducidad getFechaCaducidad() {
        return fechaCaducidad;
    }

    public FechaIngreso getFechaIngreso() {
        return fechaIngreso;
    }

    public Precio getPrecio() {
        return precio;
    }
}
