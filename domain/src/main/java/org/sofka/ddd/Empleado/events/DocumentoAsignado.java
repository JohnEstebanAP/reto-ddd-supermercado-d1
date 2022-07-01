package org.sofka.ddd.Empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.Empleado.Documento;
import org.sofka.ddd.Empleado.values.EmpleadoId;
import org.sofka.ddd.Empleado.values.TelefonoEmpleado;

public class DocumentoAsignado extends DomainEvent {
  private final EmpleadoId entityId;
  private final Documento documento;

  public DocumentoAsignado(EmpleadoId entityId, Documento documento) {
    super("ddd.empleado.documentoasignado");
    this.entityId = entityId;
    this.documento = documento;
  }

  public Documento documento() {
    return documento;
  }

  public EmpleadoId empleadoId() {
    return entityId;
  }
}
