package Ej2c;

public class MediadorBiestableTriestable implements Mediador {
  private Semaforo semaforoActual;

  public MediadorBiestableTriestable() {
    semaforoActual = new Biestable();
    semaforoActual.setMediador(this);
  }

  @Override
  public void notificar(Semaforo transmisor) {
    semaforoActual = transmisor;
    if (transmisor instanceof Biestable) {
      cambiarATriestable();
    } else {
      cambiarABiestable();
    }
  }

  public void cambiarABiestable() {
    if (semaforoActual.getEstado() instanceof Amarillo) {
      throw new IllegalStateException();
    }
    semaforoActual = new Biestable(semaforoActual.getEstado());
  }

  public void cambiarATriestable() {
    semaforoActual = new Triestable(semaforoActual.getEstado());
  }

  public void abrir() {
    semaforoActual.abrir();
  }

  public void cerrar() {
    semaforoActual.cerrar();
  }

  public void cambiar() {
    notificar(semaforoActual);
  }

  public String estado() {
    return semaforoActual.estado();
  }
}
