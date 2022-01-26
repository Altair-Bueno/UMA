package Ej2a;

/** Interfaz común para los posibles estados de un semáforo Biestable */
public interface EstadoBiestable {
  /** Devuelve una cadena indicando el estado actual */
  String estado();

  /**
   * Realiza las transiciones de la operación {@link Biestable#abrir()} para un semáforo Biestable
   *
   * @param biestable Semáforo a transitar
   */
  void abrir(Biestable biestable);

  /**
   * Realiza las transiciones de la operación {@link Biestable#cerrar()} para un semáforo Biestable
   *
   * @param biestable Semáforo a transitar
   */
  void cerrar(Biestable biestable);
}
