package org.example.joyeria.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.factura.Cliente;
import org.example.joyeria.factura.values.ClienteId;

public class ClienteAgregado extends DomainEvent {

    protected Cliente cliente;
    public ClienteAgregado(Cliente cliente) {
        super("joyeria.cliente.clienteagregado");
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ClienteId getClienteId(){
        return  cliente.identity();
    }
}
