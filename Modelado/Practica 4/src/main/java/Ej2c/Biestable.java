package Ej2c;

/**
 * Semáforo Biestable
 *
 * <p>El semáforo Biestable transita entre dos estados posibles utilizando los métodos {@link
 * Ej2c.Biestable#abrir()} y {@link Ej2c.Biestable#cerrar()}
 */
public class Biestable extends Semaforo {
  public Biestable() {
    super();
  }

  Biestable(EstadoSemaforo estado) {
    super(estado);
  }

  @Override
  public void abrir() {
    if (this.getEstado() instanceof Verde) {
      throw new IllegalStateException();
    } else {
      this.setEstado(new Verde());
    }
  }

  @Override
  public void cerrar() {
    if (this.getEstado() instanceof Rojo) {
      throw new IllegalStateException();
    } else {
      this.setEstado(new Rojo());
    }
  }
}
