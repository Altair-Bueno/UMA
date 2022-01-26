package Ej2b;

public abstract class Semaforo {
    protected EstadoSemaforo estado;

    public Semaforo(){
        estado = new Rojo();
    }

    public String estado(){
        return estado.estado();
    }

    public abstract void abrir();

    public abstract void cerrar();


}
