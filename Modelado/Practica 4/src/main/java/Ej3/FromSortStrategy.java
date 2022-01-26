package Ej3;

/** Ordena los emails por su remitente */
public class FromSortStrategy implements SortStrategy {
  @Override
  public boolean before(Email e1, Email e2) {
    assert e1 != null;
    assert e2 != null;

    return e1.getFrom().compareTo(e2.getFrom()) > 0;
  }
}
