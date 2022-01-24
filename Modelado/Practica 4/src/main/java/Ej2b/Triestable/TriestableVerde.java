package Ej2b.Triestable;

import Ej2b.EstadoSemaforo;
import Ej2b.Verde;

public class TriestableVerde extends Verde {
    @Override
    public EstadoSemaforo abrir() {
        throw new IllegalStateException("Transición no válida.");
    }

    @Override
    public EstadoSemaforo cerrar() {
        return new TriestableAmarillo();
    }
}
