package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.factura.values.FacturaId;
import org.sofka.ddd.factura.values.TotalPago;
import org.sofka.ddd.factura.values.TransaccionId;

public class TotalPagoCambiado extends DomainEvent {

    FacturaId facturaId;
    TransaccionId transaccionId;
    TotalPago totalPago;

    public TotalPagoCambiado(FacturaId facturaId, TransaccionId transaccionId, TotalPago totalPago) {
        super("ddd.factura.totalpagocambiado");
        this.facturaId = facturaId;
        this.transaccionId = transaccionId;
        this.totalPago = totalPago;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public TransaccionId transaccionId() {
        return transaccionId;
    }

    public TotalPago totalPago() {
        return totalPago;
    }
}
