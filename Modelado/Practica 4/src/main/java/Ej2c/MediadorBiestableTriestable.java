package Ej2c;

/** Interfaz que se encarga de alternar los semáforos entre biestable y triestable */
public class MediadorBiestableTriestable implements Mediador {
  private Semaforo semaforo;

  public MediadorBiestableTriestable() {
    semaforo = new Biestable();
    semaforo.setMediador(this);
  }

  @Override
  public void notificar(Semaforo transmisor) {
    semaforo = transmisor;
    if (transmisor instanceof Biestable) {
      cambiarATriestable();
    } else {
      cambiarABiestable();
    }
  }

  public void cambiarABiestable() {
    if (semaforo.getEstado() instanceof Amarillo) {
      throw new IllegalStateException();
    }
    semaforo = new Biestable(semaforo.getEstado());
  }

  public void cambiarATriestable() {
    semaforo = new Triestable(semaforo.getEstado());
  }

  public void abrir() {
    semaforo.abrir();
  }

  public void cerrar() {
    semaforo.cerrar();
  }

  public void cambiar() {
    notificar(semaforo);
  }

  public String estado() {
    return semaforo.estado();
  }
}
