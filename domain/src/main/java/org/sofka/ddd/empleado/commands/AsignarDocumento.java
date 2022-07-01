package org.sofka.ddd.empleado.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.empleado.values.*;

public class AsignarDocumento extends Command {
    private final DocumentoId entityId;
    private final NumeroDocumento numeroDocumento;
    private final TipoDocumento tipoPermiso;

    public AsignarDocumento(DocumentoId entityId, NumeroDocumento numeroDocumento, TipoDocumento tipoPermiso) {
        this.entityId = entityId;
        this.numeroDocumento = numeroDocumento;
        this.tipoPermiso = tipoPermiso;
    }

    public DocumentoId entityId() {
        return entityId;
    }

    public NumeroDocumento numeroDocumento() {
        return numeroDocumento;
    }

    public TipoDocumento tipoPermiso() {
        return tipoPermiso;
    }
}
