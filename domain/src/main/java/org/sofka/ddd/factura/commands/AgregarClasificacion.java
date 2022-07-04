package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.factura.Transaccion;
import org.sofka.ddd.factura.values.FacturaId;

public class AgregarClasificacion extends Command {
    private final FacturaId facturaId;
    private final ClienteId clienteId;

    private final Transaccion clasificacion;

    public AgregarClasificacion(FacturaId facturaId, ClienteId clienteId, Transaccion clasificacion){
        this.facturaId = facturaId;
        this.clienteId = clienteId;
        this.clasificacion = clasificacion;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Transaccion getClasificacion() {
        return clasificacion;
    }
}
