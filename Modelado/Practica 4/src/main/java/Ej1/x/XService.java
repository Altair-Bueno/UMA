package Ej1.x;

// Provides a service
class XService extends XInterface {
  XService() {}

  @Override
  public void rutina1() {
    // ...
  }

  @Override
  public void rutina2(double y) {
    // ...

  }

  @Override
  public boolean rutina3(int i) {
    // ...
    return false;
  }

  @Override
  protected int rutina4() {
    // ...
    return 0;
  }
}