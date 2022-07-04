package org.sofka.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.values.ids.ClienteId;

public class AsignarDocumentoDelCliente extends Command {

  private final ClienteId clienteId;
  private final Documento documento;

  public AsignarDocumentoDelCliente(ClienteId clienteId, Documento documento) {
    this.clienteId = clienteId;
    this.documento = documento;
  }

  public ClienteId clienteId() {
    return clienteId;
  }

  public Documento documento() {
    return documento;
  }
}
