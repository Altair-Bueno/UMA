package Ej2c;

public class Biestable extends Semaforo{
    public Biestable(){
        super();
    }

    protected Biestable(EstadoSemaforo estadoSemaforo){
        super(estadoSemaforo);
    }

    @Override
    public void abrir() {
        if(this.estadoSemaforo instanceof Rojo){
            this.estadoSemaforo = new Verde();
        }
    }

    @Override
    public void cerrar() {
        if(this.estadoSemaforo instanceof Verde){
            this.estadoSemaforo = new Rojo();
        }
    }
}
