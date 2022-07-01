package org.example.joyeria.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.factura.values.NombreCliente;
import org.example.joyeria.vendedor.values.VendedorId;

public class VendedorAsociado extends DomainEvent {

  VendedorId vendedorId;
  NombreCliente nombre;

  public VendedorAsociado(VendedorId vendedorId, NombreCliente nombre) {
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

  public VendedorId getVendedorId() {
    return vendedorId;
  }

  public void setVendedorId(VendedorId vendedorId) {
    this.vendedorId = vendedorId;
  }
}
