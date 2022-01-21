import Ej3.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class Ej3 {
  Email e1;
  Email e2;
  Email e3;

  @Before
  public void init() {
    e1 = new Email("f1", "BBB", new Date(3), new Priority(10), "Hello");
    e2 = new Email("f2", "CCCC", new Date(2), new Priority(1), "World");
    e3 = new Email("f3", "AAA", new Date(1), new Priority(3), "Something");
  }

  @Test
  public void dateSort() {
    var mailbox = new Mailbox(new DateSortStrategy());
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
  public void fromSort() {
    var mailbox = new Mailbox(new FromSortStrategy());
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
  public void subjectSort() {
    var mailbox = new Mailbox(new SubjectSortStrategy());
    mailbox.addMail(e1);
    mailbox.addMail(e2);
    mailbox.addMail(e3);
    mailbox.sort();
    var list = mailbox.getEmail();
    assert list.get(0).equals(e3);
    assert list.get(1).equals(e1);
    assert list.get(2).equals(e2);
  }

  @Test
  public void prioritySort() {
    var mailbox = new Mailbox(new PrioritySortStrategy());
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
