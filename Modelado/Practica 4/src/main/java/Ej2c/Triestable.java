package Ej2c;

public class Triestable extends Semaforo{
    public Triestable(){
        super();
    }

    Triestable(EstadoSemaforo estado){
        super(estado);
    }

    @Override
    public void abrir() {
        if(this.getEstado() instanceof Rojo){
            this.estado = new Amarillo();
        } else if (this.getEstado() instanceof Amarillo){
            this.estado = new Verde();
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void cerrar() {
        if(this.getEstado() instanceof Verde){
            this.estado = new Amarillo();
        } else if(this.getEstado() instanceof Amarillo){
            this.estado = new Rojo();
        } else {
            throw new IllegalStateException();
        }
    }
}
