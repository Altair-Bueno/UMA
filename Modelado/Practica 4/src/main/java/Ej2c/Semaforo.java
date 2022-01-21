package Ej2c;

public abstract class Semaforo {
    protected EstadoSemaforo estadoSemaforo;

    public Semaforo(){
        estadoSemaforo = new Rojo(); //Default en rojo.
    }

    protected Semaforo(EstadoSemaforo estadoSemaforo){
        this.estadoSemaforo = estadoSemaforo;
    }

    public String estado() {
        return estadoSemaforo.estado();
    }
    public abstract void abrir();
    public abstract void cerrar();


}
