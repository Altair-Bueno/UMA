package Ej2c;

public class Triestable extends Semaforo {

    public Triestable(){
        super();
    }

    protected Triestable(EstadoSemaforo estadoSemaforo){
        super(estadoSemaforo);
    }

    @Override
    public void abrir() {
        if(this.estadoSemaforo instanceof Rojo){
            this.estadoSemaforo = new Amarillo();
        } else if(this.estadoSemaforo instanceof Amarillo){
            this.estadoSemaforo = new Verde();
        }
    }

    @Override
    public void cerrar() {
        if(this.estadoSemaforo instanceof Verde){
            this.estadoSemaforo = new Amarillo();
        } else if(this.estadoSemaforo instanceof Amarillo){
            this.estadoSemaforo = new Rojo();
        }
    }
}
