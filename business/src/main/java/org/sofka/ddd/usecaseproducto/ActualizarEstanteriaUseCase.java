package org.sofka.ddd.usecaseproducto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.producto.Producto;
import org.sofka.ddd.producto.commands.ActualizarEstanteria;

public class ActualizarEstanteriaUseCase extends UseCase<RequestCommand<ActualizarEstanteria>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarEstanteria> actualizarEstanteriaRequestCommand) {
        var command = actualizarEstanteriaRequestCommand.getCommand();
        var producto = Producto.from(command.productoId(), retrieveEvents());

        producto.actualizarEstanteria(command.ubicacion(), command.estanteria());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));

    }
}
