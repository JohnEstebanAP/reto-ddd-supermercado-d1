package org.example.joyeria.factura;

import co.com.sofka.domain.generic.Entity;
import org.example.joyeria.factura.events.ClienteAgregado;
import org.example.joyeria.factura.values.ClienteId;
import org.example.joyeria.factura.values.NombreCliente;

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
