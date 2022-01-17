package Ej2.b;

public class Rojo extends EstadoTriestable{
    private MediadorConcreto mediadorConcreto;

    public Rojo(MediadorConcreto mediadorConcreto){
        this.mediadorConcreto = mediadorConcreto;
    }

    @Override
    void abrir() {
        mediadorConcreto.notifyAbrir(this);
    }

    @Override
    void cerrar() {
        mediadorConcreto.notifyCerrar(this);
    }

    @Override
    String estado() {
        return "cerrado";
    }
}
