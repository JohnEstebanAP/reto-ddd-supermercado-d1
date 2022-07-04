package org.sofka.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.values.TipoDocumento;

public class TipoDeDocumentoAsignado extends DomainEvent {

  private final Documento documento;
  private final TipoDocumento tipoDocumento;
  public TipoDeDocumentoAsignado(Documento documento, TipoDocumento tipoDocumento ) {
    super("ddd.cliente.tipodedocumentoasignado");
    this.documento = documento;
    this.tipoDocumento = tipoDocumento;
  }

  public Documento documento() {
    return documento;
  }

  public TipoDocumento tipoDocumento() {
    return tipoDocumento;
  }
}
