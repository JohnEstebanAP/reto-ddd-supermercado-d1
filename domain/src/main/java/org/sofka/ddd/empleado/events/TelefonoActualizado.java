package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.empleado.values.TelefonoEmpleado;

public class TelefonoActualizado extends DomainEvent {
  private final TelefonoEmpleado telefonoEmpleado;

  public TelefonoActualizado(TelefonoEmpleado telefonoEmpleado) {
    super("ddd.empleado.telefonoactualizado");
    this.telefonoEmpleado = telefonoEmpleado;
  }

  public String telefonoEmpleado() {
    return telefonoEmpleado.value();
  }
}
