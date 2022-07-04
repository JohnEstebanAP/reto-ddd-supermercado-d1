package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.Documento;

public class DocumentoDelClienteAsignado extends DomainEvent {

  private Documento documento;

  public DocumentoDelClienteAsignado(Documento documento) {
    super("ddd.cliente.documentodelclienteasignado");
    this.documento = documento;
  }

  public Documento documento() {
    return documento;
  }
}
