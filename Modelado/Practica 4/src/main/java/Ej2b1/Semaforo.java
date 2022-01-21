package Ej2b1;

public abstract class Semaforo {
    protected EstadoSemaforo estadoSemaforo;

    public Semaforo(){
        estadoSemaforo = new Rojo(); //Default en rojo.
    }

    public String estado() {
        return estadoSemaforo.estado();
    }

    public abstract void abrir();
    public abstract void cerrar();


}
