package Ej2a;

public class Verde implements EstadoBiestable{
    @Override
    public String estado() {
        return "abierto";
    }

    @Override
    public void abrir(Biestable biestable) {
        throw new IllegalStateException("Transición no válida");
    }

    @Override
    public void cerrar(Biestable biestable) {
        biestable.setEstado(new Rojo());
    }
}
