package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.Identity;

public class MaterialId extends Identity {

    public MaterialId(String id){
        super(id);
    }

    public MaterialId(){}

    public static MaterialId of(String id){
        return new MaterialId(id);
    }
}
