package Ej1.x;

import Ej1.A;
import Ej1.B;
import Ej1.C;
import Ej1.Client;

/** Protege la clase XService de accesos no deseados */
public class XProxy extends X {
  private Client client;
  private XService service;

  /**
   * Construye un nuevo proxy que guarda una instancia de XService
   *
   * @param client clase que llama los métodos
   */
  public XProxy(Client client) {
    this.client = client;
    this.service = new XService();
  }

  @Override
  public void rutina1() {
    service.rutina1();
  }

  @Override
  public void rutina2(double y) {
    if (!(client instanceof A) && !(client instanceof B))
      throw new IllegalCallerException("Caller must be an instance of class A or B");
    service.rutina2(y);
  }

  @Override
  public boolean rutina3(int i) {
    if (!(client instanceof A) && !(client instanceof C))
      throw new IllegalCallerException("Caller must be an instance of class A or C");
    return service.rutina3(i);
  }

  @Override
  protected int rutina4() {
    return service.rutina4();
  }
}
