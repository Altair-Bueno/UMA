package Ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mailbox {
  private SortStrategy strategy;
  private List<Email> email;

  public Mailbox(SortStrategy strategy) {
    setStrategy(strategy);
    email = new ArrayList<>();
  }

  public void addMail(Email e) {
    assert e != null;

    email.add(e);

    assert email.contains(e);
  }

  public void show() {
    for (Email e : email) {
      System.out.println(e.toString() + "\n");
    }
  }

  public void setStrategy(SortStrategy strategy) {
    assert strategy != null;

    this.strategy = strategy;
  }

  public List<Email> getEmail() {
    return Collections.unmodifiableList(email);
  }

  public void sort() {
    for (int i = email.size() - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (strategy.before(email.get(j), email.get(j + 1))) {
          var temp = email.get(j + 1);
          email.set(j + 1, email.get(j));
          email.set(j, temp);
        }
      }
    }
  }
}
