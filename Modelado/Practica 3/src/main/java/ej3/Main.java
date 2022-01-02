package ej3;

public class Main {
    public static void main(String[] args) {
        Bandeja b1 = new Bandeja(5);
        Pieza p1 = new Pieza();
        Pieza p2 = new Pieza();
        Pieza p3 = new Pieza();
        Pieza p4 = new Pieza();
        Pieza p5 = new Pieza();

        b1.put(p1);
        b1.put(p1);
        b1.put(p2);
        b1.put(p3);
        b1.get();
        b1.get();
        b1.get();
        b1.put(p1);
        b1.put(p2);
        b1.put(p3);
        b1.put(p4);
        b1.put(p5);
        b1.get();
    }
}
