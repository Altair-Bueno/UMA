package Ej2c.Biestable;

import Ej2c.EstadoSemaforo;
import Ej2c.Rojo;

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
