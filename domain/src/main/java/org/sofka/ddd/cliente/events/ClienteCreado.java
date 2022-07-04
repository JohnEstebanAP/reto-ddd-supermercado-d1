package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.Direccion;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.cliente.values.NombreCliente;


public class ClienteCreado extends DomainEvent {
    private final ClienteId entityId;

    private NombreCliente nombreCliente;
    private Documento documento;
    private MedioDePago medioDePago;
    private Direccion direccionCliente;

    public ClienteCreado(ClienteId entityId, NombreCliente nombreCliente, Documento documento, MedioDePago medioDePago, Direccion direccionCliente) {
        super("ddd.cliente.clienteCreado");
        this.entityId = entityId;
        this.nombreCliente = nombreCliente;
        this.documento = documento;
        this.medioDePago = medioDePago;
        this.direccionCliente = direccionCliente;
    }

    public ClienteId entityId() {
        return entityId;
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }

    public Documento documento() {
        return documento;
    }

    public MedioDePago medioDePago() {
        return medioDePago;
    }

    public Direccion direccionCliente() {
        return direccionCliente;
    }
}
