package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.Identity;

public class EstadoId extends Identity {

    public EstadoId(String id){
        super(id);
    }

    public EstadoId(){}

    public static EstadoId of(String id){

        return new EstadoId(id);
    }

}
