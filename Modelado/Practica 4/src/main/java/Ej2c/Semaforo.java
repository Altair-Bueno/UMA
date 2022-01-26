package Ej2c;


public abstract class Semaforo{
    private Mediador mediador;
    protected EstadoSemaforo estado;

    public Semaforo() {
        estado = new Rojo();
    }

    Semaforo(EstadoSemaforo estado){
        this.estado = estado;
    }

    public void cambiar(){
        mediador.notificar(this);
    }

    protected EstadoSemaforo getEstado(){
        return this.estado;
    }

    public void setMediador(Mediador mediador){
        this.mediador = mediador;
    }

    public String estado(){
        return estado.estado();
    }

    public abstract void abrir();
    public abstract void cerrar();

}
