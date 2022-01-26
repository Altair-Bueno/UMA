package Ej2b_old.Triestable;

import Ej2b_old.EstadoSemaforo;
import Ej2b_old.Verde;

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
