package Ej2.b;

public class Main {
    public static void main(String[] args) {
        MediadorConcreto m = new MediadorConcreto();
        Triestable t = new Triestable(m);


        System.out.println("ESTADO: " + t.estado());
        System.out.println("Abriendo...");

        t.abrir();

        System.out.println("ESTADO: " + t.estado());
        System.out.println("Abriendo...");

        t.abrir();

        System.out.println("ESTADO: " + t.estado());
        System.out.println("Cerrando...");

        t.cerrar();

        System.out.println("ESTADO: " + t.estado());
        System.out.println("Cerrando...");

        t.cerrar();

        System.out.println("ESTADO: " + t.estado());
        System.out.println("Cerrando...");

    }
}
