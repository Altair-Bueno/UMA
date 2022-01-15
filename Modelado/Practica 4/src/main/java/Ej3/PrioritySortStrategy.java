package Ej3;

public class PrioritySortStrategy implements SortStrategy {
  @Override
  public boolean before(Email e1, Email e2) {
    return e1.getPriority().compareTo(e2.getPriority()) > 0;
  }
}
