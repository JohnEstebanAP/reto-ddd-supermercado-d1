package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.Documento;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.empleado.values.TipoDocumento;

public class TipoDeDocumentoAsignado extends DomainEvent {
  private final EmpleadoId entityId;
  private final Documento documento;

  public TipoDeDocumentoAsignado(
      EmpleadoId entityId, Documento documento, TipoDocumento tipoDocumento) {
    super("ddd.empleado.tipodedocumentoasignado");
    this.entityId = entityId;
    this.documento = documento;

    actualizarTipoDeDocumento(tipoDocumento);
  }

  private void actualizarTipoDeDocumento(TipoDocumento tipoDocumento) {
    documento.tipoDocumento(tipoDocumento);
  }

  public Documento documento() {
    return documento;
  }

  public EmpleadoId empleadoId() {
    return entityId;
  }
}
