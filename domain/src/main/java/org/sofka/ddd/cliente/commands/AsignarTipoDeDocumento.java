package org.sofka.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.values.TipoDocumento;
import org.sofka.ddd.cliente.values.ids.ClienteId;

public class AsignarTipoDeDocumento extends Command {


  private final ClienteId clienteId;
  private final Documento documento;
  private final TipoDocumento tipoDocumento;
  public AsignarTipoDeDocumento(ClienteId clienteId, Documento documento, TipoDocumento tipoDocumento ) {
    this.clienteId = clienteId;
    this.documento = documento;
    this.tipoDocumento = tipoDocumento;
  }

  public ClienteId clienteId() {
    return clienteId;
  }

  public Documento documento() {
    return documento;
  }

  public TipoDocumento tipoDocumento() {
    return tipoDocumento;
  }
}
