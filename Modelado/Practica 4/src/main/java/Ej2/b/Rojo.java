package Ej2.b;

public class Rojo extends EstadoTriestable{
    public Rojo(MediadorConcreto m) {
        super(m);
    }

    @Override
    public String estado() {
        return "cerrado";
    }
}
