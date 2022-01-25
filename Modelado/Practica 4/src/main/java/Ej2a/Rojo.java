package Ej2a;

public class Rojo implements EstadoBiestable {
    @Override
    public String estado() {
        return "cerrado";
    }

    @Override
    public void abrir(Biestable biestable) {
        biestable.setEstado(new Verde());
    }

    @Override
    public void cerrar(Biestable biestable) {
        throw new IllegalStateException("Transición no válida");
    }
}
