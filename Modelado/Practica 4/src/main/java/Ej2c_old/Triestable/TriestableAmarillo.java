package Ej2c_old.Triestable;

import Ej2c_old.EstadoSemaforo;

public class TriestableAmarillo implements EstadoSemaforo {
    @Override
    public String estado() {
        return "precaución";
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
