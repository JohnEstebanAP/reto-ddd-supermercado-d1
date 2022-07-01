
package org.sofka.ddd.Empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoPermiso implements ValueObject<String> {
    private final String value;

    public TipoPermiso(String value) {
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
        TipoPermiso permiso = (TipoPermiso) o;
        return Objects.equals(value, permiso.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
