package org.sofka.ddd.Empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.Empleado.values.DocumentoId;
import org.sofka.ddd.Empleado.values.NumeroDocumento;
import org.sofka.ddd.Empleado.values.TipoDocumento;

public class AsignarTipoDocumento extends Command {
    private final DocumentoId entityId;
    private final TipoDocumento tipoPermiso;

    public AsignarTipoDocumento(DocumentoId entityId, TipoDocumento tipoPermiso) {
        this.entityId = entityId;
        this.tipoPermiso = tipoPermiso;
    }

    public DocumentoId entityId() {
        return entityId;
    }

    public TipoDocumento tipoPermiso() {
        return tipoPermiso;
    }
}
