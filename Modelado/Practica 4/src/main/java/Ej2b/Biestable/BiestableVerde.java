package Ej2b.Biestable;

import Ej2b.EstadoSemaforo;
import Ej2b.Verde;

public class BiestableVerde extends Verde {
    @Override
    public EstadoSemaforo abrir() {
        throw new IllegalStateException("Transición no válida.");
    }

    @Override
    public EstadoSemaforo cerrar() {
        return new BiestableRojo();
    }
}
