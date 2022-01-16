package Ej2.b;

public class MediadorConcreto implements Mediador{
    private Verde estadoVerde;
    private Rojo estadoRojo;
    private Amarillo estadoAmarillo;
    private EstadoTriestable estadoActual;

    public MediadorConcreto(){
        this.estadoVerde = new Verde(this);
        this.estadoRojo = new Rojo(this);
        this.estadoAmarillo = new Amarillo(this);

        this.estadoActual = this.estadoRojo;
    }

    void notifyAbrir(EstadoTriestable sender){
        if(sender.equals(this.estadoRojo)){
            cambiarAAmarillo();
        } else if (sender.equals(this.estadoAmarillo)){
            cambiarAVerde();
        }
    }

    void notifyCerrar(EstadoTriestable sender){
        if(sender.equals(this.estadoVerde)){
            cambiarAAmarillo();
        } else if (sender.equals(this.estadoAmarillo)){
            cambiarARojo();
        }
    }

    private void cambiarARojo(){
        this.estadoActual = this.estadoRojo;
    }

    private void cambiarAAmarillo(){
        this.estadoActual = this.estadoAmarillo;
    }

    private void cambiarAVerde(){
        this.estadoActual = this.estadoVerde;
    }

    public EstadoTriestable getEstadoActual() {
        return this.estadoActual;
    }
}
