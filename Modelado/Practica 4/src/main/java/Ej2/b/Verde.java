package Ej2.b;

public class Verde extends EstadoTriestable{
    public Verde(MediadorConcreto m){
        super(m);
    }

    @Override
    public String estado() {
        return "abierto";
    }
}
