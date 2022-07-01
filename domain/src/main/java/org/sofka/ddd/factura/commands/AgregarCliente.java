package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.factura.Transaccion;
import org.sofka.ddd.factura.Factura;

public class AgregarCliente extends Command {

  private final Factura factura;
  private final ClienteId clienteId;
  private final NombreCliente nombreCliente;
  private final Transaccion clasificacion;

  public AgregarCliente(Factura factura, ClienteId clienteId, NombreCliente nombreCliente, Transaccion clasificacion) {
    this.factura = factura;
    this.clienteId = clienteId;
    this.nombreCliente = nombreCliente;
    this.clasificacion = clasificacion;
  }
  public AgregarCliente(ClienteId clienteId, NombreCliente nombreCliente, Transaccion clasificacion) {
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
  public Transaccion getClasificacion() {
    return clasificacion;
  }
}
