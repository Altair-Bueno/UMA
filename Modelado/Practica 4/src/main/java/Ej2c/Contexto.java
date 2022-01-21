package Ej2c;

public class Contexto {
    private Semaforo semaforo;

    public Contexto(){
        semaforo = new Biestable();
    }

    public void abrir(){
        semaforo.abrir();
    }

    public void cerrar(){
        semaforo.cerrar();
    }

    public String estado(){
        return semaforo.estado();
    }

    public void cambio(){
        if(semaforo instanceof Biestable){
            semaforo = new Triestable(semaforo.estadoSemaforo);
        } else if(semaforo instanceof Triestable && !(semaforo.estadoSemaforo instanceof Amarillo)){
            semaforo = new Biestable(semaforo.estadoSemaforo);
        }
    }
}
