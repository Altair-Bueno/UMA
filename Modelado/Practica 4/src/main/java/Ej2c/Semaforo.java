package Ej2c;

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

    public EstadoSemaforo getEstado(){ return estado; }

    protected void setEstado(EstadoSemaforo estado){
        this.estado = estado;
    }
}
