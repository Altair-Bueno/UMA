package Ej2b_old;

public abstract class Rojo implements EstadoSemaforo{
    @Override
    public String estado() {
        return "cerrado";
    }

    @Override
    public abstract EstadoSemaforo abrir();

    @Override
    public abstract EstadoSemaforo cerrar();
}
