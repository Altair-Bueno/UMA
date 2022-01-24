package Ej2c;

public abstract class Rojo implements EstadoSemaforo {
    @Override
    public String estado() {
        return "Rojo";
    }

    @Override
    public abstract EstadoSemaforo abrir();

    @Override
    public abstract EstadoSemaforo cerrar();
}
