package org.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCliente implements ValueObject<String> {
    private final String value;

    public NombreCliente(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vació");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreCliente nombre = (NombreCliente) o;
        return Objects.equals(value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
