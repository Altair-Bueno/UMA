package Ej2.b;

public class Triestable {

    private MediadorConcreto m;


    public Triestable(MediadorConcreto m){
        this.m = m;
    }

    public String estado(){
        return m.getEstadoActual().estado();
    }

    public void abrir(){
        m.getEstadoActual().abrir();
    }

    public void cerrar(){
        m.getEstadoActual().cerrar();
    }
}
