package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.Clasificacion;
import org.sofka.ddd.factura.Factura;
import org.sofka.ddd.factura.values.ClienteId;
import org.sofka.ddd.factura.values.NombreCliente;

public class AgregarCliente extends Command {

  private final Factura factura;
  private final ClienteId clienteId;
  private final NombreCliente nombreCliente;
  private final Clasificacion clasificacion;

  public AgregarCliente(Factura factura, ClienteId clienteId, NombreCliente nombreCliente, Clasificacion clasificacion) {
    this.factura = factura;
    this.clienteId = clienteId;
    this.nombreCliente = nombreCliente;
    this.clasificacion = clasificacion;
  }
  public AgregarCliente(ClienteId clienteId, NombreCliente nombreCliente, Clasificacion clasificacion) {
    this.factura = null;
    this.clienteId = clienteId;
    this.nombreCliente = nombreCliente;
    this.clasificacion = clasificacion;
  }

  public Factura getFactura(){
    return  factura;
  }
  public ClienteId getClienteId() {
    return clienteId;
  }
  public NombreCliente getNombreCliente() {
    return nombreCliente;
  }
  public Clasificacion getClasificacion() {
    return clasificacion;
  }
}
