package org.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class DocumentoId extends Identity {
  public DocumentoId() {}

  private DocumentoId(String id) {
    super(id);
  }

  public static DocumentoId of(String id) {
    return new DocumentoId(id);
  }
}
