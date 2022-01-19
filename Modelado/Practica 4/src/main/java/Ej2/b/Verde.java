package Ej2.b;

public class Verde extends EstadoTriestable {
  public Verde(MediadorConcreto mediadorConcreto) {
    super(mediadorConcreto);
  }

  @Override
  public String estado() {
    return "abierto";
  }
}
