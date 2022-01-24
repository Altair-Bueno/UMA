package Ej2c.Triestable;

import Ej2c.EstadoSemaforo;

public class TriestableAmarillo implements EstadoSemaforo {
    @Override
    public String estado() {
        return "Amarillo";
    }

    @Override
    public EstadoSemaforo abrir() {
        return new TriestableVerde();
    }

    @Override
    public EstadoSemaforo cerrar() {
        return new TriestableRojo();
    }
}
