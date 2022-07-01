package org.sofka.ddd.usecaseproducto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.ddd.producto.Producto;
import org.sofka.ddd.producto.commands.AgregarProducto;

public class AgregarProductoUseCase
    extends UseCase<RequestCommand<AgregarProducto>, ResponseEvents> {

  @Override
  public void executeUseCase(RequestCommand<AgregarProducto> agregarProductoRequestCommand) {
    var command = agregarProductoRequestCommand.getCommand();
    var producto =
        new Producto(
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
