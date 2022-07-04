package org.sofka.ddd.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.factura.values.FacturaId;

public class ActualizarVendedor extends Command {

  protected FacturaId facturaId;
  protected EmpleadoId empleadoId;

  public ActualizarVendedor(FacturaId facturaId, EmpleadoId empleadoId) {

    this.facturaId = facturaId;
    this.empleadoId = empleadoId;
  }

  public FacturaId facturaId() {
    return facturaId;
  }

  public EmpleadoId empleadoId() {
    return empleadoId;
  }
}
