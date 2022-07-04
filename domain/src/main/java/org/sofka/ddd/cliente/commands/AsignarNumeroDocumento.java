package org.sofka.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.values.NumeroDocumento;
import org.sofka.ddd.cliente.values.ids.ClienteId;


public class AsignarNumeroDocumento extends Command {

  private final ClienteId clienteId;
  private final Documento documento;
  private final NumeroDocumento numeroDocumento;
  public AsignarNumeroDocumento(ClienteId clienteId, Documento documento, NumeroDocumento numeroDocumento ) {
    this.clienteId = clienteId;
    this.documento = documento;
    this.numeroDocumento = numeroDocumento;
  }

  public ClienteId clienteId() {
    return clienteId;
  }

  public Documento documento() {
    return documento;
  }

  public NumeroDocumento numeroDocumento() {
    return numeroDocumento;
  }
}
