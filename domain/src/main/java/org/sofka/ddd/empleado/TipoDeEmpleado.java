package org.sofka.ddd.empleado;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.empleado.values.TipoDeEmpleadoId;
import org.sofka.ddd.empleado.values.TipoEmpleado;

public class TipoDeEmpleado extends Entity<TipoDeEmpleadoId> {
  private TipoEmpleado tipoEmpleado;

  public TipoDeEmpleado(TipoDeEmpleadoId entityId, TipoEmpleado tipoEmpleado) {
    super(entityId);
    this.tipoEmpleado = tipoEmpleado;
  }

  public TipoDeEmpleado asignarTipoEmpleado (TipoDeEmpleadoId entityId, TipoEmpleado tipoEmpleado) {
    return new TipoDeEmpleado(entityId, tipoEmpleado);
  }

  public void eliminarTipoEmpleado(TipoEmpleado tipoEmpleado) {
    this.tipoEmpleado = null;
  }

  public void actualizarTipoEmpleado(TipoEmpleado tipoEmpleado) {
    this.tipoEmpleado = tipoEmpleado;
  }

  public TipoEmpleado tipoEmpleado(){
    return tipoEmpleado;
  }
}
