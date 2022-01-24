package Ej2b.Biestable;

import Ej2b.EstadoSemaforo;
import Ej2b.Rojo;

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
