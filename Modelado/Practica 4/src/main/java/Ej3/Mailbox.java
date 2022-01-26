package Ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Representa un buzón de email */
public class Mailbox {
  private final List<Email> email;
  private SortStrategy strategy;

  /**
   * Crea un nuevo buzón con la {@link SortStrategy} proporcionada
   *
   * @param strategy Estrategia para ordenar los emails
   */
  public Mailbox(SortStrategy strategy) {
    setStrategy(strategy);
    email = new ArrayList<>();
  }

  /**
   * Añade un nuevo email al buzón
   *
   * @param e email a añadir
   */
  public void addMail(Email e) {
    assert e != null;

    email.add(e);

    assert email.contains(e);
  }

  /** Muestra por consola los emails del buzón ya ordenados */
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

  /** Ordena los emails según la estrategia elegida */
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
