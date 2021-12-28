package ej1;

public class MainEj1 {
    public static void main(String[] args) {
        Profesional p1 = new Profesional();
        Profesional p2 = new Profesional();
        Paciente pac1 = Paciente.crearPaciente();
        Paciente pac2 = Paciente.crearPaciente();
        System.out.println("Profesional P1 accede al Expediente de Paciente PAC1");
        Acceso.crearAcceso(p1,pac1.getExpedienteAbierto(), TipoAcceso.CREACION);
        System.out.println("Profesional P2 accede al Expediente del paciente PAC1");
        Acceso.crearAcceso(p2, pac1.getExpedienteAbierto(), TipoAcceso.MODIFICACION);
        System.out.println("Profesional P1 vuelve a acceder al Expediente del Paciente PAC1");
        Acceso.crearAcceso(p1, pac1.getExpedienteAbierto(), TipoAcceso.MODIFICACION);
        System.out.println("");
    }
}
