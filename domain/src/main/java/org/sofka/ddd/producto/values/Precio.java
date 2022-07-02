package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {

    private final Double precio;

    public Precio(Double precio) {
        this.precio = Objects.requireNonNull(precio);
        if(precio <= 0 ){
            throw new IllegalArgumentException("El precio debe ser mayor que cero");
        }
    }

    @Override
    public Double value() {
        return precio;
    }
}
