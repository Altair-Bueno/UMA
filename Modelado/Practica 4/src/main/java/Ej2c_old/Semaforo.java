package Ej2c_old;

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

    public EstadoSemaforo getEstado(){ return estado; }

  public EstadoSemaforo getEstadoSemaforo() {
    return estado;
  }

  protected void setEstadoSemaforo(EstadoSemaforo estado) {
        this.estado = estado;
    }
}
