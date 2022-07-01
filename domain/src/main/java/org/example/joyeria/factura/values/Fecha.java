package org.example.joyeria.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Fecha implements ValueObject<String> {

    private final String value;

    public Fecha(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La fecha no puede estar vacía");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null || getClass() != o.getClass()) return false;
        Fecha that = (Fecha) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}