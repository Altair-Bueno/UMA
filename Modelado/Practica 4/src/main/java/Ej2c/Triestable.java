package Ej2c;

/**
 * Semáforo Triestable
 *
 * <p>El semáforo Triestable transita entre tres estados posibles utilizando los métodos {@link
 * Ej2c.Triestable#abrir()} y {@link Ej2c.Triestable#cerrar()}
 */
public class Triestable extends Semaforo {
  public Triestable() {
    super();
  }

  Triestable(EstadoSemaforo estado) {
    super(estado);
  }

  @Override
  public void abrir() {
    if (this.getEstado() instanceof Rojo) {
      this.setEstado(new Amarillo());
    } else if (this.getEstado() instanceof Amarillo) {
      this.setEstado(new Verde());
    } else {
      throw new IllegalStateException();
    }
  }

  @Override
  public void cerrar() {
    if (this.getEstado() instanceof Verde) {
      this.setEstado(new Amarillo());
    } else if (this.getEstado() instanceof Amarillo) {
      this.setEstado(new Rojo());
    } else {
      throw new IllegalStateException();
    }
  }
}
