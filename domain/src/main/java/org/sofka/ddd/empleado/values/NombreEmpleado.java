package org.sofka.ddd.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreEmpleado implements ValueObject<String> {
    private final String value;

    public NombreEmpleado(String value) {
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
        NombreEmpleado nombre = (NombreEmpleado) o;
        return Objects.equals(value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
