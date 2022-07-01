package org.sofka.ddd.factura;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.factura.values.ClienteId;
import org.sofka.ddd.factura.values.NombreCliente;

public class Cliente extends Entity<ClienteId> {

    protected NombreCliente nombre;
    protected Clasificacion clasificacion;

    public Cliente(ClienteId entityId, NombreCliente nombreCliente, Clasificacion clasificacion) {
        super(entityId);
        this.nombre = nombreCliente;
        this.clasificacion = clasificacion;
    }

    public Cliente(ClienteId entityId) {
        super(entityId);
    }

    public static Cliente of (ClienteId clienteId){
        return new Cliente(clienteId);
    }


    public void cambiarNombre(NombreCliente nombre){
        this.nombre = nombre;
    }

    public NombreCliente nombreCliente(){
        return this.nombre;
    }
}
