package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class ProveedorId extends Identity {

    public ProveedorId(String id){
        super(id);
    }

    public ProveedorId(){}

    public static ProveedorId of(String id){

        return new ProveedorId(id);
    }

}
