package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Caducidad implements ValueObject<String> {

    private enum TiposEmpleado{ JEFE_DE_VENTAS, JEFE_DE_ZONA, SUPERVISOR, SUPERVISOR_SEGUNDO, SUPERVISOR_TERCERO, ASISTENTE_DE_VETAS};

    TiposEmpleado tipoEmpleado;

    public Caducidad(String tipoEmpleado) {
        try{
            if (tipoEmpleado.isEmpty()) {
                throw new IllegalArgumentException("El tipo de empleado no puede estar vació");
            }

            this.tipoEmpleado = Enum.valueOf(TiposEmpleado.class , tipoEmpleado) ;
        }catch(Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String value() {
        return tipoEmpleado.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caducidad that = (Caducidad) o;
        return Objects.equals(tipoEmpleado, that.tipoEmpleado);
    }

}
