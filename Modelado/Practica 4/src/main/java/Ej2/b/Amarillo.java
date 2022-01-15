package Ej2.b;

public class Amarillo extends EstadoTriestable{
    private MediadorConcreto m;

    public Amarillo(MediadorConcreto m){
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
        return "precaucion";
    }
}
