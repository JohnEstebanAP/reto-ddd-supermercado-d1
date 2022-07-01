package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.Clasificacion;
import org.sofka.ddd.factura.values.ClienteId;
import org.sofka.ddd.factura.values.FacturaId;

public class AgregarClasificacion extends Command {
    private final FacturaId facturaId;
    private final ClienteId clienteId;

    private final Clasificacion clasificacion;

    public AgregarClasificacion(FacturaId facturaId, ClienteId clienteId, Clasificacion clasificacion){
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

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
