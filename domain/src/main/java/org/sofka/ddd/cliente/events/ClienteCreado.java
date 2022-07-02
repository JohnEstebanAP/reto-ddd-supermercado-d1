package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.Direccion;
import org.sofka.ddd.cliente.MedioDePago;
import org.sofka.ddd.cliente.values.ClienteId;
import org.sofka.ddd.cliente.values.NombreCliente;
import org.sofka.ddd.empleado.Documento;
import org.sofka.ddd.empleado.Permisos;
import org.sofka.ddd.empleado.TipoDeEmpleado;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.empleado.values.NombreEmpleado;
import org.sofka.ddd.empleado.values.TelefonoEmpleado;

import java.util.Set;

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
