package org.sofka.ddd.Empleado;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.Empleado.values.PermisoId;
import org.sofka.ddd.Empleado.values.TipoPermiso;

public class Permisos extends Entity<PermisoId> {
  private TipoPermiso tipoPermiso;

  public Permisos(PermisoId entityId, TipoPermiso tipoPermiso) {
    super(entityId);
    this.tipoPermiso = tipoPermiso;
  }

  public Permisos asignarPermiso (PermisoId entityId, TipoPermiso tipoPermiso) {
    return new Permisos(entityId, tipoPermiso);
  }

  public void eliminarPermiso(TipoPermiso tipoPermiso) {
    this.tipoPermiso = null;
  }

  public void actualizarPermiso(TipoPermiso tipoPermiso) {
    this.tipoPermiso = tipoPermiso;
  }

  public TipoPermiso tipoPermiso(){
    return tipoPermiso;
  }
}
