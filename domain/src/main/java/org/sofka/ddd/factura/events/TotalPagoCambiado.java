package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.factura.Transaccion;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.TotalPago;
import org.sofka.ddd.factura.values.TransaccionId;

public class TotalPagoCambiado extends DomainEvent {

    FacturaId facturaId;
    Transaccion transaccion;
    TotalPago totalPago;

    public TotalPagoCambiado(FacturaId facturaId, Transaccion transaccion, TotalPago totalPago) {
        super("ddd.factura.totalpagocambiado");
        this.facturaId = facturaId;
        this.transaccion = transaccion;
        this.totalPago = totalPago;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public Transaccion transaccion() {
        return transaccion;
    }

    public TotalPago totalPago() {
        return totalPago;
    }
}
