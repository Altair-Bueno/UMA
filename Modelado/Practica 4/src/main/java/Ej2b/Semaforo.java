package Ej2b;

/** Representa un semáforo que cambia de estado */
public abstract class Semaforo {
  protected EstadoSemaforo estado;

  /** Crea un nuevo semáforo y establece su estado inicial en Rojo */
  public Semaforo() {
    estado = new Rojo();
  }

  /** Devuelve una cadena indicando el estado actual */
  public String estado() {
    return estado.estado();
  }

  /** Abre el semáforo */
  public abstract void abrir();

  /** Cierra el semáforo */
  public abstract void cerrar();
}
