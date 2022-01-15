package Ej2.b;

public class Verde extends EstadoTriestable{
    private MediadorConcreto m;

    public Verde(MediadorConcreto m){
        this.m = m;
    }

    @Override
    void abrir() {
        m.notifyAbrir(this);
    }

    @Override
    void cerrar() {
        m.notifyCerrar(this);
    }

    @Override
    String estado() {
        return "abierto";
    }
}
