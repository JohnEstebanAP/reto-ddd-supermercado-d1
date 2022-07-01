package org.sofka.ddd.cliente;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.factura.EstadoFactura;

public class ClienteAgregado extends DomainEvent {

    protected EstadoFactura cliente;
    public ClienteAgregado(EstadoFactura cliente) {
        super("joyeria.cliente.clienteagregado");
        this.cliente = cliente;
    }

    public EstadoFactura getCliente() {
        return cliente;
    }

    public ClienteId getClienteId(){
        return  cliente.identity();
    }
}
