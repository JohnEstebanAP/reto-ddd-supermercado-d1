package org.sofka.ddd.producto;

import co.com.sofka.domain.generic.Entity;
import org.sofka.ddd.producto.values.Descripcion;
import org.sofka.ddd.producto.values.MaterialId;
import org.sofka.ddd.producto.values.TipoMaterial;

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
