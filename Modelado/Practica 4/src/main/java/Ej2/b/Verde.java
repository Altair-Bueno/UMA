package Ej2.b;

public class Verde extends EstadoTriestable{
    private MediadorConcreto mediadorConcreto;

    public Verde(MediadorConcreto m){
        this.mediadorConcreto = m;
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
        return "abierto";
    }
}
