package org.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDocumento implements ValueObject<String> {
    private enum TiposDocumento {TARGETA_DE_IDENTIDAD, CEDULA_DE_CIUDADANIA}
    TiposDocumento tipoDocumento;
    public TipoDocumento(String tipoDocumento) {
        try{
            if (tipoDocumento.isEmpty()) {
                throw new IllegalArgumentException("El tipo de empleado no puede estar vació");
            }

            this.tipoDocumento = Enum.valueOf(TiposDocumento.class , tipoDocumento) ;
        }catch(Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String value() {
        return tipoDocumento.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDocumento that = (TipoDocumento) o;
        return Objects.equals(tipoDocumento, that.tipoDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDocumento);
    }
}
