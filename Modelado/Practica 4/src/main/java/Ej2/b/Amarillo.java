package Ej2.b;

public class Amarillo extends EstadoTriestable{
    private MediadorConcreto mediadorConcreto;

    public Amarillo(MediadorConcreto mediadorConcreto){
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
        return "precaucion";
    }
}
