package test.usecaseempleadotest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.empleado.entitys.Documento;
import org.sofka.ddd.empleado.entitys.Permisos;
import org.sofka.ddd.empleado.entitys.TipoDeEmpleado;
import org.sofka.ddd.empleado.commands.ActualizarNombre;
import org.sofka.ddd.empleado.events.EmpleadoCreado;
import org.sofka.ddd.empleado.events.NombreActualizado;
import org.sofka.ddd.empleado.values.*;
import org.sofka.ddd.empleado.values.ids.DocumentoId;
import org.sofka.ddd.empleado.values.ids.EmpleadoId;
import org.sofka.ddd.empleado.values.ids.PermisoId;
import org.sofka.ddd.empleado.values.ids.TipoDeEmpleadoId;
import org.sofka.ddd.usecaseEmpleado.ActualizarNombreUseCase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class ActualizarNombreUseCaseTest {

  @InjectMocks
  ActualizarNombreUseCase useCase;

  @Mock
  private DomainEventRepository repository;

  @Test
  public void cuandoSeActualizaunNombreDelVendedor() {

    // arrange
    EmpleadoId empleadoId = EmpleadoId.of("1");
    NombreEmpleado nombreEmpleado = new NombreEmpleado("john");

    var command = new ActualizarNombre(empleadoId, nombreEmpleado);


    Mockito.when(repository.getEventsBy(empleadoId.value())).thenReturn(historial());
    useCase.addRepository(repository);

    // act
    var events =
        UseCaseHandler.getInstance()
            .setIdentifyExecutor("1")
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var event = (NombreActualizado) events.get(0);
    Assertions.assertEquals("ddd.empleado.nombreactualizado", event.type);
    Assertions.assertEquals("john", event.nombreEmpleado());
  }


  public List<DomainEvent> historial() {
    // arrange
    EmpleadoId empleadoId = EmpleadoId.of("1");
    NombreEmpleado nombreEmpleado = new NombreEmpleado("Luisa");
    TelefonoEmpleado telefonoEmpleado = new TelefonoEmpleado("3215801523");
    Set<Permisos> permisos = new HashSet<>();

    PermisoId permisoId = PermisoId.of("permiso1");
    TipoPermiso tipoPermiso = new TipoPermiso("VENDER_PRODUCTO");
    TipoPermiso tipoPermiso2 = new TipoPermiso("GENERAR_FACTURA");
    permisos.add(new Permisos(permisoId, tipoPermiso));
    permisos.add(new Permisos(permisoId, tipoPermiso2));

    DocumentoId documentoId = DocumentoId.of("1017272663");
    NumeroDocumento numeroDocumento = new NumeroDocumento("1017272663");
    TipoDocumento tipoDocumento = new TipoDocumento("CEDULA_DE_CIUDADANIA");
    Documento documento = new Documento(documentoId, numeroDocumento, tipoDocumento);

    TipoDeEmpleadoId tipoDeEmpleadoId = TipoDeEmpleadoId.of("te1");
    TipoEmpleado tipoEmpleado = new TipoEmpleado("ASISTENTE_DE_VETAS");

    TipoDeEmpleado tipoDeEmpleado = new TipoDeEmpleado(tipoDeEmpleadoId, tipoEmpleado);

    var command = new EmpleadoCreado( empleadoId, nombreEmpleado, telefonoEmpleado, permisos, documento, tipoDeEmpleado);

    return List.of(
      command
     );
  }
}
