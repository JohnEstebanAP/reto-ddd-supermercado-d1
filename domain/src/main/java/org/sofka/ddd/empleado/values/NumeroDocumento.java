package org.sofka.ddd.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroDocumento implements ValueObject<String> {
  private final Long value;

  public NumeroDocumento(String value) {
    try {

      if (value.isEmpty()) {
        throw new IllegalArgumentException("El Número del documento no puede estar vació");
      }

      if (!(value.length() >= 9 && value.length() < 12)) {
        throw new IllegalArgumentException(
            "El Número del documento no pude tener menos de 9 o man de 11 dígitos");
      }
    } catch (Exception e) {
      throw new IllegalArgumentException(e.getMessage());
    }

    try {
      long numeroDocumento = Long.parseLong(value);
      if (numeroDocumento < 0) {
        throw new IllegalArgumentException("El Número del documento no debe  ser negativo");
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
    NumeroDocumento numeroDocumento = (NumeroDocumento) o;
    return Objects.equals(value, numeroDocumento.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
