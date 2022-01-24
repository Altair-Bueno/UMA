package Ej2c.Triestable;

import Ej2c.EstadoSemaforo;
import Ej2c.Verde;

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
