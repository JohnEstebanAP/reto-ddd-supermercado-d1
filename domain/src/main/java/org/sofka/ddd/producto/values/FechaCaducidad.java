package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class FechaCaducidad implements ValueObject<String> {

    private final LocalDate date;
    private final String format;

    public FechaCaducidad(int day, int month, int year) {
        try {
            date = LocalDate.of(year, month, day);
            if (date.isBefore(LocalDate.now())) {
                throw new IllegalArgumentException("No es válida la fecha o El producto ya esta caducado");
            }
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        format = generateFormat();
    }

    private String generateFormat() {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public String value() {
        return format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaCaducidad that = (FechaCaducidad) o;
        return Objects.equals(format, that.format);
    }

    @Override
    public int hashCode(){
        return Objects.hash(format);
    }
}