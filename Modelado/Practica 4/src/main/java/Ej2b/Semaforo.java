package Ej2b;

public abstract class Semaforo {
    private EstadoSemaforo estado;

    public Semaforo(){
        setEstado(getEstadoInicial());
    }

    public String estado(){
        return estado.estado();
    }

    public void abrir(){
        setEstado(estado.abrir());
    }

    public void cerrar(){
        setEstado(estado.cerrar());
    }

    protected abstract EstadoSemaforo getEstadoInicial();

    protected void setEstado(EstadoSemaforo estado){
        this.estado = estado;
    }
}