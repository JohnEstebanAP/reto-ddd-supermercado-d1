package org.sofka.ddd.empleado.entitys;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.empleado.values.ids.DocumentoId;
import org.sofka.ddd.empleado.values.NumeroDocumento;
import org.sofka.ddd.empleado.values.TipoDocumento;

public class Documento extends Entity<DocumentoId> {
  private NumeroDocumento numeroDocumento;
  private TipoDocumento tipoDocumento;

  public Documento(
      DocumentoId entityId, NumeroDocumento numeroDocumento, TipoDocumento tipoDocumento) {
    super(entityId);
    this.numeroDocumento = numeroDocumento;
    this.tipoDocumento = tipoDocumento;
  }

  public Documento asignarDocumento(
      DocumentoId entityId, NumeroDocumento numeroDocumento, TipoDocumento tipoDocumento) {
    return new Documento(entityId, numeroDocumento, tipoDocumento);
  }

  public void asignarNumeroDocumento(NumeroDocumento numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public void asignarTipoDocumento(TipoDocumento tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public NumeroDocumento numeroDocumento() {
    return numeroDocumento;
  }

  public void numeroDocumento(NumeroDocumento numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public TipoDocumento tipoDocumento() {
    return tipoDocumento;
  }

  public void tipoDocumento(TipoDocumento tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }
}
