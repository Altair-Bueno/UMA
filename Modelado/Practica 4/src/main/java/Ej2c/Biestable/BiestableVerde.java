package Ej2c.Biestable;

import Ej2c.EstadoSemaforo;
import Ej2c.Verde;

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
