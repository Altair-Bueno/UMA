package Ej2b.Triestable;

import Ej2b.EstadoSemaforo;
import Ej2b.Rojo;

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
