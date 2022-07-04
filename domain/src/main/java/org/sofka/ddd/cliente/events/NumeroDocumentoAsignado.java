package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.values.NumeroDocumento;


public class NumeroDocumentoAsignado extends DomainEvent {

  private final Documento documento;
  private final NumeroDocumento numeroDocumento;
  public NumeroDocumentoAsignado(Documento documento, NumeroDocumento numeroDocumento ) {
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
