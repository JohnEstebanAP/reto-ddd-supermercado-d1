
package org.sofka.ddd.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoPermiso implements ValueObject<String> {
    private enum TiposDePermisos{ VENDER_PRODUCTO, GENERAR_FACTURA, AGREGAR_PRODUCTO, ACTUALIZAR_PRODUCTO, ELIMINAR_PRODUCTO, VER_BASE_DE_DATOS, VER_ESTADISTICAS , ASIGNAR_PERMISO};

    TiposDePermisos tipoPermiso;
    public TipoPermiso(String tipoPermiso) {
        try{
            if (tipoPermiso.isEmpty()) {
                throw new IllegalArgumentException("El tipo de permiso no puede estar vació");
            }

            this.tipoPermiso = Enum.valueOf(TiposDePermisos.class , tipoPermiso) ;
        }catch(Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String value() {
        return tipoPermiso.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoPermiso permiso = (TipoPermiso) o;
        return Objects.equals(tipoPermiso, permiso.tipoPermiso);
    }

}
