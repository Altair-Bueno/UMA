package Ej2a;

/**
 * Semáforo Biestable
 *
 * <p>El semáforo Biestable transita entre dos estados posibles utilizando los métodos {@link
 * Biestable#abrir()} y {@link Biestable#cerrar()}
 */
public class Biestable {

    private EstadoBiestable estado;

  /** Crea un nuevo semáforo Biestable en el estado inicial Rojo */
  public Biestable() {
        this.estado=new Rojo();
    }

  /** Devuelve una cadena indicando el estado actual */
  public String estado() {
        return estado.estado();
    }

  /**
   * Abre el semáforo
   *
   * <p>Posibles transiciones:
   *
   * <p>{@code Rojo -> Verde}
   *
   * @throws IllegalCallerException Si la máquina de estados no permite esa transición
   */
  public void abrir() {
        estado.abrir(this);
    }

  /**
   * Cierra el semáforo
   *
   * <p>Posibles transiciones:
   *
   * <p>{@code Rojo -> Verde}
   *
   * @throws IllegalCallerException Si la máquina de estados no permite esa transición
   */
  public void cerrar() {
        estado.cerrar(this);
    }

    public void setEstado(EstadoBiestable estado){
        this.estado=estado;
    }
}
