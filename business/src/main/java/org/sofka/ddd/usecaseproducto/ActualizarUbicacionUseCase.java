package org.sofka.ddd.usecaseproducto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.empleado.Empleado;
import org.sofka.ddd.empleado.commands.ActualizarNombre;
import org.sofka.ddd.producto.Producto;
import org.sofka.ddd.producto.commands.ActualizarUbicacion;

public class ActualizarUbicacionUseCase extends UseCase<RequestCommand<ActualizarUbicacion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarUbicacion> actualizarUbicacionRequestCommand) {
        var command = actualizarUbicacionRequestCommand.getCommand();
        var producto = Producto.from(command.productoId(), retrieveEvents());

        producto.actualizarUbicacion(command.ubicacion());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }
}
