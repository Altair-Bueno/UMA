package Ej2.b;

public abstract class EstadoTriestable {
  private MediadorConcreto mediador;

  public EstadoTriestable(MediadorConcreto m) {
    this.mediador = m;
  }

  public void abrir() {
    mediador.notifyAbrir(this);
  }

  public void cerrar() {
    mediador.notifyCerrar(this);
  }

  public abstract String estado();
}
