package Ej3;

public class DateSortStrategy implements SortStrategy {
  @Override
  public boolean before(Email e1, Email e2) {
    return e1.getDate().compareTo(e2.getDate()) > 0;
  }
}
