package Ej2.b;

import Ej1.A;

public class MediadorConcreto implements Mediador{
    private Verde v;
    private Rojo r;
    private Amarillo a;
    private EstadoTriestable estadoActual;

    public MediadorConcreto(){
        v = new Verde(this);
        r = new Rojo(this);
        a = new Amarillo(this);

        estadoActual = r;
    }

    void notifyAbrir(EstadoTriestable sender){
        if(sender.equals(r)){
            cambiarAAmarillo();
        } else if (sender.equals(a)){
            cambiarAVerde();
        }
    }

    void notifyCerrar(EstadoTriestable sender){
        if(sender.equals(v)){
            cambiarAAmarillo();
        } else if (sender.equals(a)){
            cambiarARojo();
        }
    }

    private void cambiarARojo(){
        estadoActual = r;
    }

    private void cambiarAAmarillo(){
        estadoActual = a;
    }

    private void cambiarAVerde(){
        estadoActual = v;
    }

    public EstadoTriestable getEstadoActual() {
        return estadoActual;
    }

}
