package Ej3;

public interface SortStrategy {
  /**
   * Compara dos emails
   *
   * @param e1 primer email
   * @param e2 segundo email
   * @return true si el primer email está antes que el segundo email
   */
  boolean before(Email e1, Email e2);
}
