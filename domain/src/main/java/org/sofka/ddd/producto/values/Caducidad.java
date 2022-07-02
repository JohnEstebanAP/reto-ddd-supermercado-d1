package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Caducidad implements ValueObject<String> {

    private enum TiposCaducidad{ OPTIMO, PROXIMO_A_VENCER, VENCIDO};

    TiposCaducidad caducidad;

    public Caducidad(String caducidad) {
        try{
            if (caducidad.isEmpty()) {
                throw new IllegalArgumentException("El tipo de empleado no puede estar vació");
            }

            this.caducidad = Enum.valueOf(TiposCaducidad.class , caducidad) ;
        }catch(Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String value() {
        return caducidad.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caducidad that = (Caducidad) o;
        return Objects.equals(caducidad, that.caducidad);
    }

}
