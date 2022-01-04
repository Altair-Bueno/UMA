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
    Paciente paciente = new Paciente();
    Expediente expediente = paciente.crearExpediente();
    return paciente;
  }

  public Expediente crearExpediente() {
    Expediente expediente = new Expediente(this);
    expedientes.add(expediente);
    expedienteAbierto = expediente;
    return expediente;
  }

  public Enumeration<Expediente> getExpedientes() {
    return Collections.enumeration(expedientes);
  }

  public Expediente getExpedienteAbierto() {
    return expedienteAbierto;
  }
}
