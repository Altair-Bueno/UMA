package Ej3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SortStrategy e = new SubjectSortStrategy();
        Mailbox m = new Mailbox(e);

        Email e1 = new Email("av", "abc", new Date(), Priority.P1, "Un saludo, Antono");
        Email e2 = new Email("bav", "bcd", new Date(), Priority.P3, "Un saludo");
        Email e3 = new Email("inshallah", "zzz", new Date(), Priority.P2, "pls");

        m.addMail(e1);
        m.addMail(e2);
        m.addMail(e3);

        System.out.println("----------------------------SUBJECT SORT-----------------------------");

        m.show();

        System.out.println("------------------------------DATE SORT-----------------------------");

        m.setStrategy(new DateSortStrategy());
        m.show();

        System.out.println("----------------------------PRIORITY SORT-----------------------------");

        m.setStrategy(new PrioritySortStrategy());
        m.show();

        System.out.println("-----------------------------FROM SORT-----------------------------");

        m.setStrategy(new FromSortStrategy());
        m.show();


    }
}
