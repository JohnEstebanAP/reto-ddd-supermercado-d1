package org.sofka.ddd.usecaseproducto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.producto.Producto;
import org.sofka.ddd.producto.commands.ActualizarEstanteria;
import org.sofka.ddd.producto.commands.ActualizarPasillo;

public class ActualizarPasilloUseCase extends UseCase<RequestCommand<ActualizarPasillo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarPasillo> actualizarPasilloRequestCommand) {
        var command = actualizarPasilloRequestCommand.getCommand();
        var producto = Producto.from(command.productoId(), retrieveEvents());

        producto.actualizarPasillo(command.ubicacion(), command.pasillo());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));

    }
}
