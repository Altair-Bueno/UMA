package Ej2.b;

public class Main {
    public static void main(String[] args) {
        MediadorConcreto m = new MediadorConcreto();
        Triestable t = new Triestable(m);

        int cont = 0;

        while(true){
            if(cont < 2){
                System.out.println("ESTADO: " + t.estado());
                System.out.println("Abriendo...");

                t.abrir();

                cont++;
            } else {
                System.out.println("ESTADO: " + t.estado());
                System.out.println("Cerrando...");

                t.cerrar();

                if(cont == 3){
                    cont = 0;
                }else{
                    cont++;
                }
            }

        }

    }
}
