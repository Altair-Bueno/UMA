package Ej2b_old.Biestable;

import Ej2b_old.EstadoSemaforo;
import Ej2b_old.Rojo;

public class BiestableRojo extends Rojo {
    @Override
    public EstadoSemaforo abrir() {
        return new BiestableVerde();
    }

    @Override
    public EstadoSemaforo cerrar() {
        throw new IllegalStateException("Transición no válida.");
    }
}
