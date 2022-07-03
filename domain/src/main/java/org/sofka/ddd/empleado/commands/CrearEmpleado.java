package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.entitys.Documento;
import org.sofka.ddd.empleado.entitys.Permisos;
import org.sofka.ddd.empleado.entitys.TipoDeEmpleado;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.empleado.values.NombreEmpleado;
import org.sofka.ddd.empleado.values.TelefonoEmpleado;

import java.util.Objects;
import java.util.Set;

public class CrearEmpleado extends Command {

  private final EmpleadoId entityId;
  private final NombreEmpleado nombreEmpleado;
  private final TelefonoEmpleado telefonoEmpleado;
  private final Set<Permisos> permisos;
  private final Documento documento;
  private final TipoDeEmpleado tipoDeEmpleado;

  public CrearEmpleado(
      EmpleadoId entityId,
      NombreEmpleado nombreEmpleado,
      TelefonoEmpleado telefonoEmpleado,
      Set<Permisos> permisos,
      Documento documento,
      TipoDeEmpleado tipoDeEmpleado) {
        try{
          Objects.requireNonNull(entityId);
        }catch (NullPointerException e){
          throw new IllegalArgumentException(
                  e.getMessage()
                          + " La id del empleado no puede ser nula");

        }

    this.entityId = entityId;
    this.nombreEmpleado = nombreEmpleado;
    this.telefonoEmpleado = telefonoEmpleado;
    this.permisos = permisos;
    this.documento = documento;
    this.tipoDeEmpleado = tipoDeEmpleado;
  }

  public NombreEmpleado nombreEmpleado() {
    return nombreEmpleado;
  }

  public TelefonoEmpleado telefonoEmpleado() {
    return telefonoEmpleado;
  }

  public Set<Permisos> permisos() {
    return permisos;
  }

  public Documento documento() {
    return documento;
  }

  public TipoDeEmpleado tipoDeEmpleado() {
    return tipoDeEmpleado;
  }

  public EmpleadoId entityId() {
    return entityId;
  }
}
