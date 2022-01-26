package Ej2c_old.Biestable;

import Ej2c_old.EstadoSemaforo;
import Ej2c_old.Rojo;

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
