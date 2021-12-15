package ej1;

import java.util.List;

public class Expediente {
    private Paciente paciente;
    private List<Acceso> acceso;


    Expediente(Paciente p){
        this.paciente = p;
    }

    Boolean tieneAcceso(Profesional p){
        //TODO
        return false;
    }

    public Paciente getPaciente(){
        //TODO
        return null;
    }
}
