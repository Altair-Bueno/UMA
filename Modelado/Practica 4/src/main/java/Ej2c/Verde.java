package Ej2c;

public abstract class Verde implements EstadoSemaforo {
    @Override
    public String estado() {
        return "Verde";
    }

    @Override
    public abstract EstadoSemaforo abrir();

    @Override
    public abstract EstadoSemaforo cerrar();
}
