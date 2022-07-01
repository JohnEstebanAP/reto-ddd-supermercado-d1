package org.example.joyeria.usecasevvendedor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.joyeria.vendedor.Vendedor;
import org.example.joyeria.vendedor.commands.CrearVendedor;

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
