package Ej2c;

/** Representa un semáforo que cambia de estado */
public abstract class Semaforo{
    private Mediador mediador;
    private EstadoSemaforo estado;

    /** Crea un nuevo semáforo y establece su estado inicial en Rojo */
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

    /** Devuelve una cadena indicando el estado actual */
    public String estado(){
        return estado.estado();
    }

    /** Abre el semáforo */
    public abstract void abrir();

    /** Cierra el semáforo */
    public abstract void cerrar();

}
