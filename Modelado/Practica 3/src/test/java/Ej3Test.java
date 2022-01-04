import ej3.Bandeja;
import ej3.Pieza;

public class Ej3Test {
  @org.junit.Test(expected = IllegalStateException.class)
  public void bandejaLlena() {
    var b1 = new Bandeja(2);
    b1.put(new Pieza());
    b1.put(new Pieza());
    b1.put(new Pieza());
  }

  @org.junit.Test(expected = AssertionError.class)
  public void bandejaInvalida() {
    var b1 = new Bandeja(-1);
  }

  @org.junit.Test(expected = AssertionError.class)
  public void piezaEnBandeja() {
    Bandeja b1 = new Bandeja(3);
    Bandeja b2 = new Bandeja(1);

    Pieza p1 = new Pieza();
    Pieza p2 = new Pieza();

    b1.put(p1);
    b1.put(p1);
    b1.put(p2);
    b1.get();
    b1.get();
    b1.get();

    b2.put(p1);
    b2.get();
  }

  @org.junit.Test(expected = IllegalStateException.class)
  public void bandejaVacia() {
    var b1 = new Bandeja(1);
    b1.get();
  }

  @org.junit.Test()
  public void normal() {
    Bandeja b1 = new Bandeja(2);
    Bandeja b2 = new Bandeja(2);

    Pieza p1 = new Pieza();
    Pieza p2 = new Pieza();

    b1.put(p1);
    b1.put(p2);
    b2.put(b1.get());
    b2.put(b1.get());
    assert b2.size() == 2;
    assert b1.size() == 0;
  }
}
