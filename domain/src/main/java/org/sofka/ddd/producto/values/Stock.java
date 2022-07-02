package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Stock implements ValueObject<Integer> {

    private final Integer cantidad;

    public Stock(Integer cantidad) {
        this.cantidad = Objects.requireNonNull(cantidad);
        if(cantidad < 0 ){
            throw new IllegalArgumentException("El stock no puede ser inferior a cero");
        }
    }

    public Stock cambiarStock( Integer cantidad ) {
        return new Stock(cantidad);
    }

    @Override
    public Integer value() {
        return cantidad;
    }
}
