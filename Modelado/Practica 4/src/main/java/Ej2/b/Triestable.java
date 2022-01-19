package Ej2.b;

public class Triestable {

  private final MediadorConcreto mediadorConcreto;

  public Triestable(MediadorConcreto mediadorConcreto) {
    this.mediadorConcreto = mediadorConcreto;
  }

  public String estado() {
    return mediadorConcreto.getEstadoActual().estado();
  }

  public void abrir() {
    mediadorConcreto.getEstadoActual().abrir();
  }

  public void cerrar() {
    mediadorConcreto.getEstadoActual().cerrar();
  }
}
