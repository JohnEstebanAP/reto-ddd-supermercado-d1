package org.sofka.ddd.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class FechaIngreso implements ValueObject<String> {

    private final LocalDate date;
    private final String format;

    public FechaIngreso(LocalDate date) {
        try {
            if (date.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("No es válida la fecha");
            }
            this.date = date;
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
        FechaIngreso that = (FechaIngreso) o;
        return Objects.equals(format, that.format);
    }

    @Override
    public int hashCode(){
        return Objects.hash(format);
    }
}