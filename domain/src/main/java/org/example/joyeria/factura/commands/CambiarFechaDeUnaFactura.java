package org.example.joyeria.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.factura.values.FacturaId;
import org.example.joyeria.factura.values.Fecha;

public class CambiarFechaDeUnaFactura extends Command {

    private final FacturaId facteraId;
    private final Fecha fecha;

    public CambiarFechaDeUnaFactura(FacturaId facteraId, Fecha fecha) {
        this.facteraId = facteraId;
        this.fecha = fecha;
    }

    public FacturaId getFacteraId() {
        return facteraId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
