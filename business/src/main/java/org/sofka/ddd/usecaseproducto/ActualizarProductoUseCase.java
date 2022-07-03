package org.sofka.ddd.usecaseproducto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.producto.Producto;
import org.sofka.ddd.producto.commands.ActualizarProducto;
import org.sofka.ddd.producto.commands.AgregarProducto;

public class ActualizarProductoUseCase
    extends UseCase<RequestCommand<ActualizarProducto>, ResponseEvents> {

  @Override
  public void executeUseCase(RequestCommand<ActualizarProducto> actualizarProductoRequestCommand) {
    var command = actualizarProductoRequestCommand.getCommand();
    var producto = Producto.from(command.productoId(), retrieveEvents());

    producto.actualizarProducto(
            command.productoId(),
            command.ubicacion(),
            command.proveedor(),
            command.estadoDelProducto(),
            command.nombreProducto(),
            command.nombreMarca(),
            command.stock(),
            command.fechaProducto(),
            command.fechaCaducidad(),
            command.fechaIngreso(),
            command.precio());

    emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));

  }
}
