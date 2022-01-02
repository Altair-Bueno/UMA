import ej3.*;
public class Ej3Test {
    @org.junit.Test
    public void test3(){
        Bandeja b1 = new Bandeja(3);
        Bandeja b2 = new Bandeja(1);

        Pieza p1 = new Pieza();
        Pieza p2 = new Pieza();
        Pieza p3 = new Pieza();

        b1.put(p1);
        b1.put(p2);
        b1.put(p3);
        b1.get();
        b1.get();
        b1.get();

        b2.put(p1);
        b2.get();
    }
}
