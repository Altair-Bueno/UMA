package ej1;

public class Test {
    @org.junit.Test
    public void test1() {
        Profesional p1 = new Profesional();
        Profesional p2 = new Profesional();
        Paciente pac1 = Paciente.crearPaciente();
        Paciente pac2 = Paciente.crearPaciente();
        Acceso.crearAcceso(p1, pac1.getExpedienteAbierto(), TipoAcceso.Creacion);
        Acceso.crearAcceso(p2, pac1.getExpedienteAbierto(), TipoAcceso.Modificacion);
        Acceso.crearAcceso(p1, pac1.getExpedienteAbierto(), TipoAcceso.Modificacion);
    }
}
