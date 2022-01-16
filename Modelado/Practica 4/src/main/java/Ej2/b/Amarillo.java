package Ej2.b;

public class Amarillo extends EstadoTriestable{
    public Amarillo(MediadorConcreto m){
        super(m);
    }

    @Override
    public String estado() {
        return "precaucion";
    }
}
