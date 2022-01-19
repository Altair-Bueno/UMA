package Ej1.x;

import Ej1.Client;

public abstract class X {
  public static X getInstance(Client caller) {
    return new Proxy(caller);
  }

  public abstract void rutina1();

  public abstract void rutina2(double y);

  public abstract boolean rutina3(int i);

  protected abstract int rutina4();
}
