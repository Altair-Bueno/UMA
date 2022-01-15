package Ej3;

public class FromSortStrategy implements SortStrategy {
  @Override
  public boolean before(Email e1, Email e2) {
    return e1.getFrom().compareTo(e2.getFrom()) > 0;
  }
}
