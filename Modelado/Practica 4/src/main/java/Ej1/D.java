package Ej1;

import Ej1.x.XProxy;

public class D extends XProxy {

  public D(Client caller) {
    super(caller);
  }

  @Override
  protected int rutina4() {
    return 1;
  }
}
