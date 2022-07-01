package org.sofka.ddd.factura;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.factura.values.EstadoActual;
import org.sofka.ddd.factura.values.EstadoFacturaId;
import org.sofka.ddd.factura.values.Fecha;

public class EstadoFactura extends Entity<EstadoFacturaId> {

    protected Fecha fecha;
    protected EstadoActual estadoActual;

    public EstadoFactura(EstadoFacturaId entityId, Fecha fecha, EstadoActual estadoActual) {
        super(entityId);
        this.fecha = fecha;
        this.estadoActual = estadoActual;
    }

    public EstadoFactura(EstadoFacturaId entityId) {
        super(entityId);
    }

    public static EstadoFactura of (EstadoFacturaId entityId){
        return new EstadoFactura(entityId);
    }


    public void cambiarfecha(Fecha fecha){
        this.fecha = fecha;
    }

    public void cambiarEstado(EstadoActual estadoActual){
        this.estadoActual = estadoActual;
    }
}
