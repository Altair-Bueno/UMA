import Ej3.*;
import org.junit.Test;

import java.util.Date;

public class Ej3 {
  @Test
  public void dateSort() {
    var mailbox = new Mailbox(new DateSortStrategy());
    var e1 = new Email("f1", "Practica 1", new Date(1), new Priority(10), "Hello");
    var e2 = new Email("f2", "Practica 2", new Date(100), new Priority(1), "World");
    var e3 = new Email("f3", "Practica 3", new Date(1000), new Priority(3), "Something");
    mailbox.addMail(e1);
    mailbox.addMail(e2);
    mailbox.addMail(e3);
    mailbox.sort();
    var list = mailbox.getEmail();
    assert list.get(0).equals(e1);
    assert list.get(1).equals(e2);
    assert list.get(2).equals(e3);
  }

  @Test
  public void fromSort() {
    var mailbox = new Mailbox(new FromSortStrategy());
    var e1 = new Email("C", "Practica 1", new Date(1), new Priority(10), "Hello");
    var e2 = new Email("B", "Practica 2", new Date(100), new Priority(1), "World");
    var e3 = new Email("A", "Practica 3", new Date(1000), new Priority(3), "Something");
    mailbox.addMail(e1);
    mailbox.addMail(e2);
    mailbox.addMail(e3);
    mailbox.sort();
    var list = mailbox.getEmail();
    assert list.get(0).equals(e3);
    assert list.get(1).equals(e2);
    assert list.get(2).equals(e1);
  }

  @Test
  public void subjectSort() {
    var mailbox = new Mailbox(new SubjectSortStrategy());
    var e1 = new Email("C", "BBBB", new Date(1), new Priority(10), "Hello");
    var e2 = new Email("B", "CCCC", new Date(100), new Priority(1), "World");
    var e3 = new Email("A", "AAAA", new Date(1000), new Priority(3), "Something");
    mailbox.addMail(e1);
    mailbox.addMail(e2);
    mailbox.addMail(e3);
    mailbox.sort();
    var list = mailbox.getEmail();
    assert list.get(0).equals(e2);
    assert list.get(1).equals(e3);
    assert list.get(2).equals(e1);
  }

  @Test
  public void prioritySort() {
    var mailbox = new Mailbox(new PrioritySortStrategy());
    var e1 = new Email("C", "BBBB", new Date(1), new Priority(10), "Hello");
    var e2 = new Email("B", "CCCC", new Date(100), new Priority(1), "World");
    var e3 = new Email("A", "AAAA", new Date(1000), new Priority(3), "Something");
    mailbox.addMail(e1);
    mailbox.addMail(e2);
    mailbox.addMail(e3);
    mailbox.sort();
    var list = mailbox.getEmail();
    assert list.get(0).equals(e2);
    assert list.get(1).equals(e3);
    assert list.get(2).equals(e1);
  }
}
