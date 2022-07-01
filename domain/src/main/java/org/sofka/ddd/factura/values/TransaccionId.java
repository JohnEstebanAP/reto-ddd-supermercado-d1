package org.sofka.ddd.factura.values;

import co.com.sofka.domain.generic.Identity;

public class TransaccionId extends Identity {

    public TransaccionId() {
    }

    public TransaccionId(String uuid) {
        super(uuid);
    }

    public static TransaccionId of(String id){
        return new TransaccionId(id);
    }
}
