package Ej2b_old.Triestable;

import Ej2b_old.EstadoSemaforo;
import Ej2b_old.Rojo;

public class TriestableRojo extends Rojo {
    @Override
    public EstadoSemaforo abrir() {
        return new TriestableAmarillo();
    }

    @Override
    public EstadoSemaforo cerrar() {
        throw new IllegalStateException("Transición no válida.");
    }
}
