package Ej1;

import Ej1.x.XProxy;

/** Clase base de los clientes */
public class Client {
  private XProxy x;

  public Client() {
    x = new XProxy(this);
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
