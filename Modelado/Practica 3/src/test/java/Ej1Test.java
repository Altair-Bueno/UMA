import ej1.*;
import org.junit.Test;

public class Ej1Test {

  @Test
  public void expedienteAbierto() {
    Paciente pac1 = Paciente.crearPaciente();
    Expediente x = pac1.getExpedienteAbierto();
    assert x == null;
  }

  @Test
  public void cerrarExpedienteAbierto() {
    var paciente = Paciente.crearPaciente();
    var expediente = paciente.getExpedientes().nextElement();
    paciente.setExpedienteAbierto(expediente);

    assert paciente.getExpedienteAbierto().equals(expediente);

    paciente.setExpedienteAbierto(null);

    assert paciente.getExpedienteAbierto() == null;
  }

  @Test(expected = AssertionError.class)
  public void expedienteAbiertoDistintoPaciente() {
    var paciente1 = Paciente.crearPaciente();
    var expediente = paciente1.getExpedientes().nextElement();
    var paciente2 = Paciente.crearPaciente();
    paciente2.setExpedienteAbierto(expediente);
  }

  @Test
  public void testEjecucion() {
    Profesional p1 = new Profesional();
    Profesional p2 = new Profesional();
    Paciente pac1 = Paciente.crearPaciente();
    var expediente = pac1.getExpedientes().nextElement();
    Acceso.crearAcceso(p1, expediente, TipoAcceso.CREACION);
    Acceso.crearAcceso(p2, expediente, TipoAcceso.MODIFICACION);
    Acceso.crearAcceso(p1, expediente, TipoAcceso.MODIFICACION);
  }
}
