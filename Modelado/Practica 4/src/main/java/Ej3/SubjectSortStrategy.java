package Ej3;

public class SubjectSortStrategy implements SortStrategy {
  @Override
  public boolean before(Email e1, Email e2) {
    assert e1 != null;
    assert e2 != null;

    return e1.getSubject().compareTo(e2.getSubject()) > 0;
  }
}
