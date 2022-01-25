package Ej1;

import Ej1.x.XProxy;

public class D extends XProxy {
  /**
   * Construye un nuevo proxy que guarda una instancia de XService
   *
   * @param client clase que llama los métodos
   */
  public D(Client client) {
    super(client);
  }

  @Override
  protected int rutina4() {
    return super.rutina4();
  }
}
