package Ej2b;

public abstract class Semaforo {
    private EstadoSemaforo estado;

    public Semaforo(){
    setEstadoSemaforo(getEstadoInicial());
    }

    public String estado(){
        return estado.estado();
    }

    public void abrir(){
    setEstadoSemaforo(estado.abrir());
    }

    public void cerrar(){
    setEstadoSemaforo(estado.cerrar());
    }

    protected abstract EstadoSemaforo getEstadoInicial();

  protected void setEstadoSemaforo(EstadoSemaforo estado) {
        this.estado = estado;
    }

  public EstadoSemaforo getEstadoSemaforo() {
    return estado;
  }
}
