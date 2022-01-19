package Ej2.b;

public class Main {
  private static final int numEstados = 3;

  public static void main(String[] args) {
    MediadorConcreto m = new MediadorConcreto();
    Triestable t = new Triestable(m);

    int cont = 0;

    while (true) {
      if (cont < numEstados - 1) {
        System.out.println("ESTADO: " + t.estado());
        System.out.println("Abriendo...");

        t.abrir();

        cont++;
      } else {
        System.out.println("ESTADO: " + t.estado());
        System.out.println("Cerrando...");

        t.cerrar();

        if (cont == numEstados) {
          cont = 0;
        } else {
          cont++;
        }
      }
    }
  }
}
