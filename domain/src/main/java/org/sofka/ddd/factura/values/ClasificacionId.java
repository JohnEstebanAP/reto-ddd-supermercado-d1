package org.sofka.ddd.factura.values;

import co.com.sofka.domain.generic.Identity;

public class ClasificacionId extends Identity {

    public ClasificacionId(String uuid) {
        super(uuid);
    }

    public ClasificacionId() {
    }

    public static ClasificacionId of(String id){
        return new ClasificacionId(id);
    }
}
