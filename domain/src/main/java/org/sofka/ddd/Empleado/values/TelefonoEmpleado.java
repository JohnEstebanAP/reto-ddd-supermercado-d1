package org.sofka.ddd.Empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TelefonoEmpleado implements ValueObject<String> {

  private final Long value;

  public TelefonoEmpleado(String value) {
    try {

      if (value.isEmpty()) {
        throw new IllegalArgumentException("El Número del teléfono no puede estar vació");
      }

      if (!(value.length() >= 9 && value.length() < 12)) {
        throw new IllegalArgumentException(
            "El Número del teléfono no pude tener menos de 9 o man de 11 dígitos");
      }

    } catch (Exception e) {
      throw new IllegalArgumentException(e.getMessage());
    }

    try {
      long numeroDocumento = Long.parseLong(value);
      if (numeroDocumento < 0) {
        throw new IllegalArgumentException("El Número del teléfono no debe  ser negativo");
      }
      this.value = numeroDocumento;
    } catch (Exception e) {
      throw new IllegalArgumentException(
          e.getMessage()
              + " Sole debe ingresar un número este no pede tener letras o caracteres especiales");
    }
  }

  public String value() {
    return value.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TelefonoEmpleado telefono = (TelefonoEmpleado) o;
    return Objects.equals(value, telefono.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
