package Ej2c;

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
