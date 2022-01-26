package Ej2c;

/** Interfaz necesaria para aplicar el patrón mediador*/
public interface Mediador {

  /** Método que alterna el semáforo entre biestable y triestable y que implementa {@link Ej2c.MediadorBiestableTriestable} */
  void notificar(Semaforo transmisor);
}
