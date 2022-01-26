package Ej3;

/** Ordena los emails por fecha */
public class DateSortStrategy implements SortStrategy {
  @Override
  public boolean before(Email e1, Email e2) {
    assert e1 != null;
    assert e2 != null;

    return e1.getDate().compareTo(e2.getDate()) > 0;
  }
}
