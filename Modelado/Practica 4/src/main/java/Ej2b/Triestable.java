package Ej2b;

public class Triestable extends Semaforo {
    @Override
    public void abrir() {
        if(this.estado instanceof Rojo){
            this.estado = new Amarillo();
        } else if (this.estado instanceof Amarillo){
            this.estado = new Verde();
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void cerrar() {
        if(this.estado instanceof Verde){
            this.estado = new Amarillo();
        } else if(this.estado instanceof Amarillo){
            this.estado = new Rojo();
        } else {
            throw new IllegalStateException();
        }
    }
}
