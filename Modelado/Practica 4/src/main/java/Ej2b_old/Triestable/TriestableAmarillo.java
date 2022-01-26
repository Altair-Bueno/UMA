package Ej2b_old.Triestable;

import Ej2b_old.EstadoSemaforo;

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
