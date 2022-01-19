package Ej2.b;

public class Rojo extends EstadoTriestable {
  public Rojo(MediadorConcreto mediadorConcreto) {
    super(mediadorConcreto);
  }

  @Override
  public String estado() {
    return "cerrado";
  }
}
