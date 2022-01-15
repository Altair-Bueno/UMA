package Ej2.b;

public class Rojo extends EstadoTriestable{
    private MediadorConcreto m;

    public Rojo(MediadorConcreto m){
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
        return "cerrado";
    }
}
