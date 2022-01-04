package ej1;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class Expediente {
  private final Paciente paciente;
  private final Set<Acceso> acceso;

  Expediente(Paciente paciente) {
    assert (paciente != null);

    acceso = new HashSet<>();
    this.paciente = paciente;
  }

  Acceso getAcceso(Profesional profesional) {
    for (Acceso a : acceso) {
      if (a.getProfesional().equals(profesional)) {
        return a;
      }
    }
    return null;
  }

  void addAcceso(Acceso acceso) {
    this.acceso.add(acceso);
  }

  public Enumeration<Acceso> getAccesos() {
    return Collections.enumeration(acceso);
  }

  public Paciente getPaciente() {
    return paciente;
  }
}
