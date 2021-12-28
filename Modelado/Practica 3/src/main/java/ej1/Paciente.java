package ej1;

import java.util.*;

public class Paciente {
    private Expediente expedienteAbierto;
    private Set<Expediente> expedientes;

    Paciente(){
        expedientes = new HashSet<>();
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

    public Enumeration<Expediente> getExpedientes(){
        return Collections.enumeration(expedientes);
    }

    public Expediente getExpedienteAbierto(){
        return expedienteAbierto;
    }
}
