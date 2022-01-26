package Ej2c_old.Biestable;

import Ej2c_old.EstadoSemaforo;
import Ej2c_old.Verde;

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
