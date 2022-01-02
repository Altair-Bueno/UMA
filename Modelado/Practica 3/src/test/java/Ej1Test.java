import ej1.Acceso;
import ej1.Paciente;
import ej1.Profesional;
import ej1.TipoAcceso;

public class Ej1Test {
  @org.junit.Test
  public void test1() {
    Profesional p1 = new Profesional();
    Profesional p2 = new Profesional();
    Paciente pac1 = Paciente.crearPaciente();
    Paciente pac2 = Paciente.crearPaciente();
    Acceso.crearAcceso(p1, pac1.getExpedienteAbierto(), TipoAcceso.CREACION);
    Acceso.crearAcceso(p2, pac1.getExpedienteAbierto(), TipoAcceso.MODIFICACION);
    Acceso.crearAcceso(p1, pac1.getExpedienteAbierto(), TipoAcceso.MODIFICACION);
  }
}
