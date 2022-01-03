import ej1.*;
import org.junit.*;

import java.util.Iterator;

public class Ej1Test {

    @Test
    public void testExpAbiertoEnExps() {
        // El expediente que se crea con el
        // paciente tiene que estar en la lista
        // de expedientes del paciente.

        Paciente pac1 = Paciente.crearPaciente();
        Expediente x = pac1.getExpedienteAbierto();
        int cont = 0;
        for (Iterator<Expediente> it = pac1.getExpedientes().asIterator(); it.hasNext(); ) {
            Expediente e = it.next();
            if (e.equals(x)) {
                cont++;
            }
        }

        assert cont == 1;
    }
    @Test
    public void testEjecucion() {
        Profesional p1 = new Profesional();
        Profesional p2 = new Profesional();
        Paciente pac1 = Paciente.crearPaciente();
        Paciente pac2 = Paciente.crearPaciente();
        Acceso ac1 = Acceso.crearAcceso(p1, pac1.getExpedienteAbierto(), TipoAcceso.CREACION);
        Acceso ac2 = Acceso.crearAcceso(p2, pac1.getExpedienteAbierto(), TipoAcceso.MODIFICACION);
        Acceso ac3 = Acceso.crearAcceso(p1, pac1.getExpedienteAbierto(), TipoAcceso.MODIFICACION);

    }


}
