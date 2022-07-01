package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.Identity;

public class EstadoDelProductoId extends Identity {

    public EstadoDelProductoId(String id){
        super(id);
    }

    public EstadoDelProductoId(){}

    public static EstadoDelProductoId of(String id){

        return new EstadoDelProductoId(id);
    }

}
