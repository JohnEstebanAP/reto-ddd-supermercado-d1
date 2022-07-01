package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.values.DocumentoId;
import org.sofka.ddd.empleado.values.NumeroDocumento;

public class AsignarNumeroDocumento extends Command {
  private final DocumentoId entityId;
  private final NumeroDocumento numeroDocumento;

  public AsignarNumeroDocumento(
      DocumentoId entityId, NumeroDocumento numeroDocumento) {
    this.entityId = entityId;
    this.numeroDocumento = numeroDocumento;
  }

  public DocumentoId entityId() {
    return entityId;
  }

  public NumeroDocumento numeroDocumento() {
    return numeroDocumento;
  }
}
