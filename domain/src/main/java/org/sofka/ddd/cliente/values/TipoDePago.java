package org.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDePago implements ValueObject<String> {
    private enum TiposDePago {TARJETA, EFECTIVO}
    TiposDePago tipoDePago;
    public TipoDePago(String tipoDePago) {
        try{
            if (tipoDePago.isEmpty()) {
                throw new IllegalArgumentException("El tipo de empleado no puede estar vació");
            }

            this.tipoDePago = Enum.valueOf(TiposDePago.class , tipoDePago) ;
        }catch(Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String value() {
        return tipoDePago.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDePago that = (TipoDePago) o;
        return Objects.equals(tipoDePago, that.tipoDePago);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDePago);
    }
}
