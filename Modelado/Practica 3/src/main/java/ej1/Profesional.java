package ej1;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class Profesional {
  // Attributes
  private Set<Acceso> acceso;

  // Constructor
  public Profesional() {
    acceso = new HashSet<>();
  }

  // Methods
  Acceso getAcceso(Expediente expediente) {
    for (Acceso a : acceso) {
      if (a.getExpediente().equals(expediente)) {
        return a;
      }
    }
    return null;
  }

  void addAcceso(Acceso acceso) {
    assert acceso != null;
    assert !this.acceso.contains(acceso);

    int sizePre = this.acceso.size();

    this.acceso.add(acceso);

    assert this.acceso.size() == sizePre + 1;
    assert this.acceso.contains(acceso);
  }

  public Enumeration<Acceso> getAccesos() {
    return Collections.enumeration(acceso);
  }
}
