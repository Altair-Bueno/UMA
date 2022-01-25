package Ej3;

import java.util.Objects;

public class Priority implements Comparable<Priority> {
  private int level;

  public Priority(int level) {
    this.level = level;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Priority)) return false;
    Priority priority = (Priority) o;
    return level == priority.level;
  }

  @Override
  public int hashCode() {
    return Objects.hash(level);
  }

  @Override
  public int compareTo(Priority o) {
    return Integer.compare(this.level, o.level);
  }
}