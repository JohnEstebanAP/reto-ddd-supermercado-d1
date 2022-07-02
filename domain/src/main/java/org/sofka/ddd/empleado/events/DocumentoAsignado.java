package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.entitys.Documento;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;

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
