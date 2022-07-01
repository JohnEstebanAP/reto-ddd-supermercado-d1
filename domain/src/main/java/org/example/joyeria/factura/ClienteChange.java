package org.example.joyeria.factura;

import co.com.sofka.domain.generic.EventChange;
import org.example.joyeria.factura.events.ClasificacionAgregada;
import org.example.joyeria.factura.events.FacturaAgregada;
import org.example.joyeria.factura.events.FechaDeUnaFacturaCambiada;
import org.example.joyeria.factura.events.TipoDeUnaClasificacionCambiada;
import org.example.joyeria.factura.events.*;

public class ClienteChange extends EventChange {
  public ClienteChange(Factura factura) {

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
