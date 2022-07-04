package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.values.NumeroDocumento;


public class NumeroDocumentoActualizado extends DomainEvent {

  private final Documento documento;
  private final NumeroDocumento numeroDocumento;
  public NumeroDocumentoActualizado(Documento documento, NumeroDocumento numeroDocumento ) {
    super("ddd.cliente.numerodocumentoasignado");
    this.documento = documento;
    this.numeroDocumento = numeroDocumento;
  }

  public Documento documento() {
    return documento;
  }

  public NumeroDocumento numeroDocumento() {
    return numeroDocumento;
  }
}
