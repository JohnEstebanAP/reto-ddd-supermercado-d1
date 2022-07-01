package org.sofka.ddd.factura.values;

import co.com.sofka.domain.generic.Identity;

public class EstadoFacturaId extends Identity {

    public EstadoFacturaId() {
    }

    public EstadoFacturaId(String uuid) {
        super(uuid);
    }

    public static EstadoFacturaId of(String id){
        return new EstadoFacturaId(id);
    }
}
