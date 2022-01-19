package Ej3;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {
  private SortStrategy strategy;
  private List<Email> email;

  public Mailbox(SortStrategy strategy) {
    email = new ArrayList<>();
    this.strategy = strategy;
  }

  public void addMail(Email e) {
    email.add(e);
  }

  public void show() {
    for (Email e : email) {
      System.out.println(e.toString() + "\n");
    }
  }

  public void setStrategy(SortStrategy strategy) {
    this.strategy = strategy;
  }

  public void sort() {
    for (int i = 2; i <= email.size(); i++) {
      for (int j = email.size(); j >= i; j--) {
        if (strategy.before(email.get(j), email.get(j - 1))) {
          Email temp = email.get(j);
          email.set(j - 1, temp);
          email.set(j, email.get(j - 1));
        }
      }
    }
  }
}
