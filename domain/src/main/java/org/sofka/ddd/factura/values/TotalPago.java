package org.sofka.ddd.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalPago implements ValueObject<String> {

    private final Double value;

    public TotalPago(Double value){
        this.value = value;
    }

    @Override
    public String value() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null || getClass() != o.getClass()) return false;
        TotalPago that = (TotalPago) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}