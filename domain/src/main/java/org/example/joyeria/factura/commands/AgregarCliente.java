package org.example.joyeria.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.factura.Clasificacion;
import org.example.joyeria.factura.Factura;
import org.example.joyeria.factura.values.ClienteId;
import org.example.joyeria.factura.values.FacturaId;
import org.example.joyeria.factura.values.NombreCliente;

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
