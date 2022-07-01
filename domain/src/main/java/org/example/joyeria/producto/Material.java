package org.example.joyeria.producto;

import co.com.sofka.domain.generic.Entity;
import org.example.joyeria.producto.values.Descripcion;
import org.example.joyeria.producto.values.MaterialId;
import org.example.joyeria.producto.values.TipoMaterial;

import java.util.Objects;

public class Material extends Entity<MaterialId> {

    private TipoMaterial tipoMaterial;
    private Descripcion descripcion;

    protected Material(MaterialId id, TipoMaterial tipoMaterial, Descripcion descripcion) {
        super(id);
        this.tipoMaterial = Objects.requireNonNull(tipoMaterial);
        this.descripcion = descripcion;
    }

    public Material(MaterialId id) {
        super(id);
    } //min 40

}
