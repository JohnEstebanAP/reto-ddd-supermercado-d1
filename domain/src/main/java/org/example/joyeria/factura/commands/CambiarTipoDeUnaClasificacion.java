package org.example.joyeria.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.factura.Clasificacion;
import org.example.joyeria.factura.values.ClienteId;
import org.example.joyeria.factura.values.FacturaId;

public class CambiarTipoDeUnaClasificacion extends Command {
    private final FacturaId facturaId;
    private final ClienteId clienteId;

    private final Clasificacion clasificacion;

    public CambiarTipoDeUnaClasificacion(FacturaId facturaId, ClienteId clienteId, Clasificacion clasificacion){
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
