package org.sofka.ddd.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.empleado.Documento;
import org.sofka.ddd.empleado.values.EmpleadoId;
import org.sofka.ddd.empleado.values.NumeroDocumento;

public class NumeroDocumentoAsignado extends DomainEvent {
  private final EmpleadoId entityId;
  private final Documento documento;

  public NumeroDocumentoAsignado(EmpleadoId entityId, Documento documento, NumeroDocumento numeroDocumento) {
    super("ddd.empleado.numerodocumentoasignado");
    this.entityId = entityId;
    this.documento = documento;

    actualizarNumeroDocumento(numeroDocumento);
  }
  private void actualizarNumeroDocumento(NumeroDocumento numeroDocumento){
    documento.numeroDocumento(numeroDocumento);
  }

  public Documento documento() {
    return documento;
  }

  public EmpleadoId empleadoId() {
    return entityId;
  }
}
