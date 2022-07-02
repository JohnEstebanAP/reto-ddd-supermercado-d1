package org.sofka.ddd.cliente;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.cliente.values.DireccionCasa;
import org.sofka.ddd.cliente.values.DireccionId;

public class Direccion extends Entity<DireccionId> {
  private DireccionCasa direccionCliente;

  public Direccion(DireccionId entityId, DireccionCasa direccionCliente) {
    super(entityId);
    this.direccionCliente = direccionCliente;
  }

  public Direccion asignarDireccion(DireccionId entityId, DireccionCasa direccionCliente) {
    return new Direccion(entityId, direccionCliente);
  }

  public void actualizarDireccionCliente(DireccionCasa direccionCliente) {
    this.direccionCliente = direccionCliente;
  }
}
