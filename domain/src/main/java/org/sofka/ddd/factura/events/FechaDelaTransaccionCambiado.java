package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.factura.Transaccion;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.Fecha;
import org.sofka.ddd.factura.values.TotalPago;
import org.sofka.ddd.factura.values.TransaccionId;

public class FechaDelaTransaccionCambiado extends DomainEvent {

    FacturaId facturaId;
    Transaccion transaccion;
    Fecha fecha;

    public FechaDelaTransaccionCambiado(FacturaId facturaId, Transaccion transaccion, Fecha fecha) {
        super("ddd.factura.fechadelatransaccioncambiado");
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
