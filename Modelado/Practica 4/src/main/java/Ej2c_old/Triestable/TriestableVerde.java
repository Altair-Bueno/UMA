package Ej2c_old.Triestable;

import Ej2c_old.EstadoSemaforo;
import Ej2c_old.Verde;

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
