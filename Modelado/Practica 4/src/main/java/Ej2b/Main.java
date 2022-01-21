package Ej2b;

public class Main {
    public static void main(String[] args) {
        Semaforo s = new Triestable();
        System.out.println(s.estado());
        s.abrir();
        System.out.println(s.estado());
        s.abrir();
        System.out.println(s.estado());
        s.cerrar();
        System.out.println(s.estado());
        s.abrir();
        System.out.println(s.estado());
        s.cerrar();
        System.out.println(s.estado());
        s.cerrar();
        System.out.println(s.estado());
    }
}
