package Ej2a;

public class Biestable {

    private EstadoBiestable estado;

    public Biestable(){
        this.estado=new Rojo();
    }

    public String estado(){
        return estado.estado();
    }

    public void abrir(){
        estado.abrir(this);
    }

    public void cerrar(){
        estado.cerrar(this);
    }

    public void setEstado(EstadoBiestable estado){
        this.estado=estado;
    }
}
