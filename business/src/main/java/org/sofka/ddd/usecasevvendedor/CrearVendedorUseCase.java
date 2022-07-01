package org.sofka.ddd.usecasevvendedor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.vendedor.Vendedor;
import org.sofka.ddd.vendedor.commands.CrearVendedor;

public class CrearVendedorUseCase extends UseCase<RequestCommand<CrearVendedor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearVendedor> CrearVendedorRequest) {
        var command = CrearVendedorRequest.getCommand();
        var vendedor = new Vendedor(
                command.getEntityId(),
                command.getNombre()
        );
        emit().onResponse(new ResponseEvents(vendedor.getUncommittedChanges()));

    }
}
