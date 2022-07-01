package org.sofka.ddd.Empleado;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.Empleado.values.DocumentoId;
import org.sofka.ddd.Empleado.values.NumeroDocumento;
import org.sofka.ddd.Empleado.values.TipoDocumento;

public class Documento extends Entity<DocumentoId> {
  private NumeroDocumento numeroDocumento;
  private TipoDocumento tipoDocumento;

  public Documento(DocumentoId entityId, NumeroDocumento numeroDocumento, TipoDocumento tipoDocumento) {
    super(entityId);
    this.numeroDocumento = numeroDocumento;
    this.tipoDocumento = tipoDocumento;
  }

  public Documento asignarDocumento(DocumentoId entityId, NumeroDocumento numeroDocumento, TipoDocumento tipoDocumento) {
    return new Documento(entityId, numeroDocumento, tipoDocumento);
  }

  public void asignarNumeroDocumento(NumeroDocumento numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public void asignarTipoDocumento(TipoDocumento tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public NumeroDocumento NumeroDocumento() {
    return numeroDocumento;
  }

  public TipoDocumento TipoDocumento() {
    return tipoDocumento;
  }
}
