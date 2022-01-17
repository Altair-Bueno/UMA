package Ej2.b;

import Ej1.A;

public class MediadorConcreto implements Mediador{
    private Verde estadoVerde;
    private Rojo estadoRojo;
    private Amarillo estadoAmarillo;
    private EstadoTriestable estadoActual;

    public MediadorConcreto(){
        estadoVerde = new Verde(this);
        estadoRojo = new Rojo(this);
        estadoAmarillo = new Amarillo(this);

        estadoActual = estadoRojo;
    }

    void notifyAbrir(EstadoTriestable sender){
        if(sender.equals(estadoRojo)){
            cambiarAAmarillo();
        } else if (sender.equals(estadoAmarillo)){
            cambiarAVerde();
        }
    }

    void notifyCerrar(EstadoTriestable sender){
        if(sender.equals(estadoVerde)){
            cambiarAAmarillo();
        } else if (sender.equals(estadoAmarillo)){
            cambiarARojo();
        }
    }

    private void cambiarARojo(){
        estadoActual = estadoRojo;
    }

    private void cambiarAAmarillo(){
        estadoActual = estadoAmarillo;
    }

    private void cambiarAVerde(){
        estadoActual = estadoVerde;
    }

    public EstadoTriestable getEstadoActual() {
        return estadoActual;
    }

}
