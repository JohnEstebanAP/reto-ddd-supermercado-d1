package org.sofka.ddd.producto.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.ddd.producto.values.NombreMarca;
import org.sofka.ddd.producto.values.ProductoId;

public class ActualizarNombreMarca extends Command {


  private final ProductoId productoId;
  private final NombreMarca nombreMarca;

  public ActualizarNombreMarca(ProductoId productoId, NombreMarca nombreMarca) {

    this.productoId  = productoId;
    this.nombreMarca = nombreMarca;
  }


  public ProductoId productoId() {
    return productoId;
  }

  public NombreMarca nombreMarca() {
    return nombreMarca;
  }
}
