package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.Identity;

public class provedorId extends Identity {

    public provedorId(String id){
        super(id);
    }

    public provedorId(){}

    public static provedorId of(String id){

        return new provedorId(id);
    }

}
