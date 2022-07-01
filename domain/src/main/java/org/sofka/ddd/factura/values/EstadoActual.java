package org.sofka.ddd.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoActual implements ValueObject<String> {

    private enum EstadosFactura{ Iniciado, Pagado, Canselado};

    EstadosFactura estadoActual;

    public EstadoActual(String estadoActual) {
        try{
            if (estadoActual.isEmpty()) {
                throw new IllegalArgumentException("El tipo de empleado no puede estar vació");
            }

            this.estadoActual = Enum.valueOf(EstadosFactura.class , estadoActual) ;
        }catch(Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String value() {
        return estadoActual.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoActual that = (EstadoActual) o;
        return Objects.equals(estadoActual, that.estadoActual);
    }

}
