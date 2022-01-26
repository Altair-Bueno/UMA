package Ej2c;

public class Biestable extends Semaforo{
    public Biestable(){
        super();
    }

    Biestable(EstadoSemaforo estado){
        super(estado);
    }

    @Override
    public void abrir() {
        if(this.estado instanceof Verde){
            throw new IllegalStateException();
        } else {
            this.estado = new Verde();
        }
    }

    @Override
    public void cerrar() {
        if(this.estado instanceof Rojo){
            throw new IllegalStateException();
        } else {
            this.estado = new Rojo();
        }
    }
}
