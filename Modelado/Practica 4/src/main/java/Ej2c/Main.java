package Ej2c;

public class Main {
    public static void main(String[] args) {
        Contexto c = new Contexto();

        c.abrir();
        System.out.println(c.estado());
        c.cerrar();
        System.out.println(c.estado());
        c.cambio();
        System.out.println(c.estado());
        c.abrir();
        System.out.println(c.estado());
        c.abrir();
        System.out.println(c.estado());
        c.cerrar();
        System.out.println(c.estado());
        c.cambio();
        System.out.println(c.estado());
    }
}
