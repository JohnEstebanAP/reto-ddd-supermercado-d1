package org.sofka.ddd.factura;

import co.com.sofka.domain.generic.EventChange;
import org.sofka.ddd.cliente.ClienteAgregado;
import org.sofka.ddd.cliente.NombreDeUnClienteActualizado;
import org.sofka.ddd.factura.events.FacturaAgregada;
import org.sofka.ddd.factura.events.FechaDeUnaFacturaCambiada;
import org.sofka.ddd.factura.events.TipoDeUnaClasificacionCambiada;
import org.sofka.ddd.factura.events.*;

public class FacturaChange extends EventChange {
  public FacturaChange(Factura factura) {

    apply(
        (ClienteAgregado event) -> {
          factura.cliente = event.getCliente();
        });

    apply(
        (VendedorAsociado event) -> {
          factura.vendedorId = event.getVendedorId();
        });

    apply(
        (ProductoAsociado event) -> {
          //   cliente.productos.add(new Producto(event.getProductoId(), event.getNombre()));
        });

    apply(
        (NombreDeUnClienteActualizado event) -> {
          //factura.nombre = event.getNombre();
        });

    apply((ClasificacionAgregada event) -> {});

    apply((FacturaAgregada event) -> {});

    apply((TipoDeUnaClasificacionCambiada event) -> {});

    apply((FechaDeUnaFacturaCambiada event) -> {});
  }
}
