package org.sofka.ddd.Empleado;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.Empleado.values.PermisoId;
import org.sofka.ddd.Empleado.values.TipoDeEmpleadoId;
import org.sofka.ddd.Empleado.values.TipoEmpleado;
import org.sofka.ddd.Empleado.values.TipoPermiso;

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
