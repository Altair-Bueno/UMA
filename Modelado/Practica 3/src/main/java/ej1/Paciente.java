package ej1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Paciente {
    private Expediente expedienteAbierto;
    private Set<Expediente> expedientes;

    Paciente(){
        expedientes = new HashSet<Expediente>();
    }

    public static Paciente crearPaciente(){
        Paciente p = new Paciente();
        Expediente exp = p.crearExpediente();
        return p;
    }

    public Expediente crearExpediente(){
        Expediente exp = new Expediente(this);
        expedientes.add(exp);
        expedienteAbierto = exp;
        return exp;
    }

    public Set<Expediente> getExpedientes(){
        return expedientes;
    }

    public Expediente getExpedienteAbierto(){

        Iterator<Expediente> iter = expedientes.iterator();
        Expediente exp = iter.next();
        while(iter.hasNext()) {
            exp = (Expediente) iter.next();
            iter.next();
        }
        return exp;
    }


}
