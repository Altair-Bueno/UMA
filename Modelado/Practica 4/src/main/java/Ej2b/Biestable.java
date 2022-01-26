package Ej2b;

/**
 * Semáforo Biestable
 *
 * <p>El semáforo Biestable transita entre dos estados posibles utilizando los métodos {@link
 * Biestable#abrir()} y {@link Biestable#cerrar()}
 */
public class Biestable extends Semaforo {
  @Override
  public void abrir() {
    if (this.estado instanceof Verde) {
      throw new IllegalStateException();
    } else {
      this.estado = new Verde();
    }
  }

  @Override
  public void cerrar() {
    if (this.estado instanceof Rojo) {
      throw new IllegalStateException();
    } else {
      this.estado = new Rojo();
    }
  }
}
