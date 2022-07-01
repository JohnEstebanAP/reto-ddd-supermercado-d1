package org.sofka.ddd.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.values.EmpleadoId;

public class VendedorAsociado extends DomainEvent {

  EmpleadoId vendedorId;
  NombreCliente nombre;

  public VendedorAsociado(EmpleadoId vendedorId, NombreCliente nombre) {
    super("joyeria.cliente.vendedorasociado");
    this.vendedorId = vendedorId;
    this.nombre = nombre;
  }

  public NombreCliente getNombre() {
    return nombre;
  }

  public void setNombre(NombreCliente nombre) {
    this.nombre = nombre;
  }

  public EmpleadoId getVendedorId() {
    return vendedorId;
  }

  public void setVendedorId(EmpleadoId vendedorId) {
    this.vendedorId = vendedorId;
  }
}
