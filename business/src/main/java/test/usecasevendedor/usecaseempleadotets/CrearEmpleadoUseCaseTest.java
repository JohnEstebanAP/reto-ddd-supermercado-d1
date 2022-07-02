package test.usecasevendedor.usecaseempleadotets;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.sofka.ddd.empleado.Documento;
import org.sofka.ddd.empleado.Permisos;
import org.sofka.ddd.empleado.TipoDeEmpleado;
import org.sofka.ddd.empleado.values.*;
import org.sofka.ddd.producto.EstadoDelProducto;
import org.sofka.ddd.producto.Proveedor;
import org.sofka.ddd.producto.Ubicacion;
import org.sofka.ddd.producto.commands.AgregarProducto;
import org.sofka.ddd.producto.values.*;
import org.sofka.ddd.usecaseEmpleado.CrearEmpleadoUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.ddd.empleado.commands.CrearEmpleado;
import org.sofka.ddd.empleado.events.EmpleadoCreado;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class CrearEmpleadoUseCaseTest {

  @InjectMocks CrearEmpleadoUseCase useCase;

  @Test
  public void cuandoSeCreaUnVendedor() {

    // arrange
    EmpleadoId empleadoId = EmpleadoId.of("111111");
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

    var command =
        new CrearEmpleado(
            empleadoId, nombreEmpleado, telefonoEmpleado, permisos, documento, tipoDeEmpleado);

    // act
    var events =
        UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var event = (EmpleadoCreado) events.get(0);
    Assertions.assertEquals("111111", event.entityId().value());
  }
}
