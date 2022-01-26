package Ej2c;


public abstract class Semaforo{
    private Mediador mediador;
    private EstadoSemaforo estado;

    public Semaforo() {
        estado = new Rojo();
    }

    Semaforo(EstadoSemaforo estado){
        this.estado = estado;
    }

    protected EstadoSemaforo getEstado(){
        return this.estado;
    }

    protected void setEstado(EstadoSemaforo estado){
        this.estado = estado;
    }

    protected void setMediador(Mediador mediador){
        this.mediador = mediador;
    }

    public String estado(){
        return estado.estado();
    }

    public abstract void abrir();
    public abstract void cerrar();

}
