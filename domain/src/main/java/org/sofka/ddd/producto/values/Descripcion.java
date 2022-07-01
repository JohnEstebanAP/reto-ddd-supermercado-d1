package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
public class Descripcion implements ValueObject<String> {

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    private final String descripcion;

    @Override
    public String value() {
        return descripcion;
    }

}