import Ej1.A;
import Ej1.B;
import Ej1.C;
import Ej1.Client;
import org.junit.Test;

public class Ej1 {
  @Test
  public void rutina1Client() {
    var client = new Client();
    client.runRutina1();
  }

  @Test(expected = IllegalCallerException.class)
  public void rutina2Client() {
    var client = new Client();
    client.runRutina2();
  }

  @Test(expected = IllegalCallerException.class)
  public void rutina3Client() {
    var client = new Client();
    client.runRutina3();
  }

  @Test
  public void rutina1A() {
    var a = new A();
    a.runRutina1();
  }

  @Test
  public void rutina2A() {
    var a = new A();
    a.runRutina2();
  }

  @Test
  public void rutina3A() {
    var a = new A();
    a.runRutina3();
  }

  @Test
  public void rutina1B() {
    var b = new B();
    b.runRutina1();
  }

  @Test
  public void rutina2B() {
    var b = new B();
    b.runRutina2();
  }

  @Test(expected = IllegalCallerException.class)
  public void rutina3B() {
    var b = new B();
    b.runRutina3();
  }

  @Test
  public void rutina1C() {
    var c = new C();
    c.runRutina1();
  }

  @Test(expected = IllegalCallerException.class)
  public void rutina2C() {
    var c = new C();
    c.runRutina2();
  }

  @Test
  public void rutina3C() {
    var c = new C();
    c.runRutina3();
  }
}
