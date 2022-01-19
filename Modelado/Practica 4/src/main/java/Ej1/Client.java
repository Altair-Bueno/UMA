package Ej1;

import Ej1.x.X;

public class Client {
  private final X x;

  public Client() {
    x = X.getInstance(this);
  }

  public void runRutina1() {
    x.rutina1();
  }

  public void runRutina2() {
    x.rutina2(2.0);
  }

  public void runRutina3() {
    x.rutina3(10);
  }
}
