package ej1;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class Paciente {
  private final Set<Expediente> expedientes;
  private Expediente expedienteAbierto;

  Paciente() {
    expedientes = new HashSet<>();
  }

  public static Paciente crearPaciente() {
    Paciente p = new Paciente();
    Expediente exp = p.crearExpediente();
    return p;
  }

  public Expediente crearExpediente() {
    Expediente exp = new Expediente(this);
    expedientes.add(exp);
    expedienteAbierto = exp;
    return exp;
  }

  public Enumeration<Expediente> getExpedientes() {
    return Collections.enumeration(expedientes);
  }

  public Expediente getExpedienteAbierto() {
    return expedienteAbierto;
  }
}
