package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoProducto implements ValueObject<String> {

    private enum EstadosProducto{ ALFRENTE , PROMOCION ,DESCUENTO };

     EstadosProducto estadoProducto;

    public EstadoProducto(String estadoProducto) {
        try{
            if (estadoProducto.isEmpty()) {
                throw new IllegalArgumentException("El tipo de empleado no puede estar vació");
            }

            this.estadoProducto = Enum.valueOf(EstadosProducto.class , estadoProducto) ;
        }catch(Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String value() {
        return estadoProducto.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoProducto that = (EstadoProducto) o;
        return Objects.equals(estadoProducto, that.estadoProducto);
    }

}
