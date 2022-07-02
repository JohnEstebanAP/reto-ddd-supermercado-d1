package test.usecasevendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.cliente.Direccion;
import org.sofka.ddd.cliente.Documento;
import org.sofka.ddd.cliente.MedioDePago;
import org.sofka.ddd.cliente.commands.CrearCliente;
import org.sofka.ddd.cliente.events.ClienteCreado;
import org.sofka.ddd.cliente.values.*;
import org.sofka.ddd.usucaseCliente.CrearClienteUseCase;

import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class CrearClienteUseCaseTest {

  @InjectMocks
  CrearClienteUseCase useCase;

  @Test
  public void cuandoSeCreaUnCliente() {

    // arrange
    ClienteId clienteId = ClienteId.of("111111");

    NombreCliente nombreCliente = new NombreCliente("Luisa");

    DocumentoId documentoId = DocumentoId.of("1017275689");
    NumeroDocumento numeroDocumento = new NumeroDocumento("1017275689");
    TipoDocumento tipoDocumento = new TipoDocumento("CEDULA_DE_CIUDADANIA");
    Documento documento = new Documento(documentoId, numeroDocumento, tipoDocumento);

    MedioDePagoId medioDePagoId = MedioDePagoId.of("999");
    TipoDePago tipoDePago = new TipoDePago("EFECTIVO"); //TARJETA
    MontoDeDinero montoDeDinero = new MontoDeDinero(5000000.0);
    MedioDePago medioDePago = new MedioDePago(medioDePagoId, tipoDePago, montoDeDinero);

    DireccionId direccionId = DireccionId.of("71");
    DireccionCasa direccionCasa = new DireccionCasa("Calle 71C #54-44");
    Direccion direccionCliente = new Direccion(direccionId, direccionCasa);

    var command = new CrearCliente(
            clienteId, nombreCliente, documento, medioDePago, direccionCliente
    );

    // act
    var events =
        UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var event = (ClienteCreado) events.get(0);
    Assertions.assertEquals("111111", event.entityId().value());
  }
}
