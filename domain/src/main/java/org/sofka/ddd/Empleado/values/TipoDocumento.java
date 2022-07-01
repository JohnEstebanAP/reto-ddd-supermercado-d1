package org.sofka.ddd.Empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDocumento implements ValueObject<String> {
    private final String value;

    public TipoDocumento(String value) {
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
        TipoDocumento tipoDocumento = (TipoDocumento) o;
        return Objects.equals(value, tipoDocumento.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
