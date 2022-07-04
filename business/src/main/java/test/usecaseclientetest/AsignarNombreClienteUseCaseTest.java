package test.usecaseclientetest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.cliente.entitys.Direccion;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.events.ClienteCreado;
import org.sofka.ddd.cliente.events.NombreClienteAsignado;
import org.sofka.ddd.cliente.values.*;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.cliente.values.ids.DireccionId;
import org.sofka.ddd.cliente.values.ids.DocumentoId;
import org.sofka.ddd.cliente.values.ids.MedioDePagoId;
import org.sofka.ddd.usucaseCliente.AsignarNombreClienteUseCase;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AsignarNombreClienteUseCaseTest {

  @InjectMocks AsignarNombreClienteUseCase useCase;

  @Mock private DomainEventRepository repository;

  @Test
  public void cuandoSeAsignaUnNombreAlCliente() {

    // arrange
    ClienteId clienteId = ClienteId.of("1017272663");
    NombreCliente nombreCliente = new NombreCliente("Luisa Fernanda");

    var event = new NombreClienteAsignado(nombreCliente);
    event.setAggregateRootId(clienteId.value());

    when(repository.getEventsBy(clienteId.value())).thenReturn(historial());
    useCase.addRepository(repository);

    // act
    var events =
        UseCaseHandler.getInstance()
            .setIdentifyExecutor("1017272663")
            .syncExecutor(useCase, new TriggeredEvent<>(event))
            .orElseThrow()
            .getDomainEvents();
    // assert

    var nombreAsignado = (NombreClienteAsignado) events.get(0);
    Assertions.assertEquals("ddd.cliente.nombreclienteasignado", nombreAsignado.type);
    Assertions.assertEquals("Luisa Fernanda", nombreAsignado.nombreCliente().value());
  }

  public List<DomainEvent> historial() {

    ClienteId clienteId = ClienteId.of("1017272663");

    NombreCliente nombreCliente = new NombreCliente("Luisa");

    DocumentoId documentoId = DocumentoId.of("1017275689");
    NumeroDocumento numeroDocumento = new NumeroDocumento("1017275689");
    TipoDocumento tipoDocumento = new TipoDocumento("CEDULA_DE_CIUDADANIA");
    Documento documento = new Documento(documentoId, numeroDocumento, tipoDocumento);

    MedioDePagoId medioDePagoId = MedioDePagoId.of("999");
    TipoDePago tipoDePago = new TipoDePago("EFECTIVO"); // TARJETA
    MontoDeDinero montoDeDinero = new MontoDeDinero(5000000.0);
    MedioDePago medioDePago = new MedioDePago(medioDePagoId, tipoDePago, montoDeDinero);

    DireccionId direccionId = DireccionId.of("71");
    DireccionCasa direccionCasa = new DireccionCasa("Calle 71C #54-44");
    Direccion direccionCliente = new Direccion(direccionId, direccionCasa);

    var command =
        new ClienteCreado(clienteId, nombreCliente, documento, medioDePago, direccionCliente);

    return List.of(command);
  }
}
