package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.Identity;

public class UbicacionId extends Identity {

    public UbicacionId(String id){
        super(id);
    }

    public UbicacionId(){}

    public static UbicacionId of(String id){

        return new UbicacionId(id);
    }

}
