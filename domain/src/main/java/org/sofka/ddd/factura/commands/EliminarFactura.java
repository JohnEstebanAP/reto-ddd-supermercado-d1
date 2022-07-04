package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.values.FacturaId;

public class EliminarFactura extends Command {

    private final FacturaId facturaId;

    public EliminarFactura(FacturaId facturaId) {
        this.facturaId = facturaId;
    }

    public FacturaId facturaId() {
        return facturaId;
    }
}
