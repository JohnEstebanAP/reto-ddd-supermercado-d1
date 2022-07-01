package org.sofka.ddd.factura.values;

import co.com.sofka.domain.generic.Identity;

public class FacturaId extends Identity {

    public FacturaId() {
    }

    public FacturaId(String uuid) {
        super(uuid);
    }

    public static FacturaId of(String id){
        return new FacturaId(id);
    }
}
