package Ej2.b;

public class Amarillo extends EstadoTriestable {
  public Amarillo(MediadorConcreto mediadorConcreto) {
    super(mediadorConcreto);
  }

  @Override
  public String estado() {
    return "precaucion";
  }
}
