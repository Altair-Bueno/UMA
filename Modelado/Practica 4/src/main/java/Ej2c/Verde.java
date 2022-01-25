package Ej2c;

public abstract class Verde implements EstadoSemaforo {
    @Override
    public String estado() {
        return "abierto";
    }

    @Override
    public abstract EstadoSemaforo abrir();

    @Override
    public abstract EstadoSemaforo cerrar();
}
