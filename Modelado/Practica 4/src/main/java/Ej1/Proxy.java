package Ej1;

public class Proxy extends X {
  private Object caller;
  private X service;

  public Proxy(Object caller, X service) {
    this.caller = caller;
    this.service = service;
  }

  @Override
  public void rutina1() {
    service.rutina1();
  }

  @Override
  public void rutina2(double y) {
    if (!(caller instanceof A) && !(caller instanceof B))
      throw new IllegalCallerException("Caller must be instance of class A or B");
    service.rutina2(y);
  }

  @Override
  public boolean rutina3(int i) {
    if (!(caller instanceof A) && !(caller instanceof C))
      throw new IllegalCallerException("Caller must be instance of class A or C");
    return service.rutina3(i);
  }

  @Override
  protected int rutina4() {
    return service.rutina4();
  }
}
