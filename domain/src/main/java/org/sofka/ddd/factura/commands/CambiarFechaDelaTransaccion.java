package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.Transaccion;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.Fecha;

public class CambiarFechaDelaTransaccion extends Command {

    FacturaId facturaId;
    Transaccion transaccion;
    Fecha fecha;

    public CambiarFechaDelaTransaccion(FacturaId facturaId, Transaccion transaccion, Fecha fecha) {
        this.facturaId = facturaId;
        this.transaccion = transaccion;
        this.fecha = fecha;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public Transaccion transaccion() {
        return transaccion;
    }

    public Fecha fecha() {
        return fecha;
    }
}
