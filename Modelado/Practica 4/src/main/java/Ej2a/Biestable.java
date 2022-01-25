package Ej2a;

public class Biestable {
    private EstadoBiestable estado;

    public Biestable(){
        this.estado = new Rojo();
    }

    public String estado(){
        return estado.estado();
    }

    public void abrir(){
        if(estado.estado().equals(("Abierto"))){
            throw new IllegalStateException();
        } else {
            estado = new Verde();
        }
    }

    public void cerrar(){
        if(estado.estado().equals(("Cerrado"))){
            throw new IllegalStateException();
        } else {
            estado = new Rojo();
        }
    }
}
