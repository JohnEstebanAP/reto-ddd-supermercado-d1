package test.usecaseclientetest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.cliente.commands.AsignarDocumentoDelCliente;
import org.sofka.ddd.cliente.entitys.Direccion;
import org.sofka.ddd.cliente.entitys.Documento;
import org.sofka.ddd.cliente.entitys.MedioDePago;
import org.sofka.ddd.cliente.events.ClienteCreado;
import org.sofka.ddd.cliente.events.DocumentoDelClienteAsignado;
import org.sofka.ddd.cliente.values.*;
import org.sofka.ddd.cliente.values.ids.ClienteId;
import org.sofka.ddd.cliente.values.ids.DireccionId;
import org.sofka.ddd.cliente.values.ids.DocumentoId;
import org.sofka.ddd.cliente.values.ids.MedioDePagoId;
import org.sofka.ddd.usucaseCliente.AsignarDocumentoDelClienteUseCase;


import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AsignarDocumentoDelClienteUseCaseTest {

  @InjectMocks
  AsignarDocumentoDelClienteUseCase useCase;

  @Mock private DomainEventRepository repository;

  @Test
  public void cuandoSeAsignaUnDocumentoAlCliente() {

    final String CEDULA = "1017245689";

    // arrange
    ClienteId clienteId = ClienteId.of(CEDULA);

    DocumentoId documentoId = DocumentoId.of(CEDULA);
    NumeroDocumento numeroDocumento = new NumeroDocumento(CEDULA);
    TipoDocumento tipoDocumento = new TipoDocumento("CEDULA_DE_CIUDADANIA");
    Documento documento = new Documento(documentoId, numeroDocumento, tipoDocumento);

    var event = new DocumentoDelClienteAsignado(documento);
    event.setAggregateRootId(clienteId.value());

    when(repository.getEventsBy(clienteId.value())).thenReturn(historial());
    useCase.addRepository(repository);

    // act
    var events =
        UseCaseHandler.getInstance()
            .setIdentifyExecutor(CEDULA)
            .syncExecutor(useCase, new TriggeredEvent<>(event))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var documentoAsignado = (DocumentoDelClienteAsignado) events.get(0);
    Assertions.assertEquals(CEDULA, documentoAsignado.documento().identity().value());
  }

  public List<DomainEvent> historial() {

    ClienteId clienteId = ClienteId.of("1017275689");

    NombreCliente nombreCliente = new NombreCliente("Luisa Fernanda");

    Documento documento = null;

    MedioDePagoId medioDePagoId = MedioDePagoId.of("999");
    TipoDePago tipoDePago = new TipoDePago("EFECTIVO"); // TARJETA
    MontoDeDinero montoDeDinero = new MontoDeDinero(5000000.0);
    MedioDePago medioDePago = new MedioDePago(medioDePagoId, tipoDePago, montoDeDinero);

    DireccionId direccionId = DireccionId.of("71");
    DireccionCasa direccionCasa = new DireccionCasa("Calle 71C #54-44");
    Direccion direccionCliente = new Direccion(direccionId, direccionCasa);

    var event =
        new ClienteCreado(clienteId, nombreCliente, documento, medioDePago, direccionCliente);

    return List.of(event);
  }
}
