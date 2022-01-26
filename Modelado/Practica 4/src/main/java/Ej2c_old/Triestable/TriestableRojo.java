package Ej2c_old.Triestable;

import Ej2c_old.EstadoSemaforo;
import Ej2c_old.Rojo;

public class TriestableRojo extends Rojo {
    @Override
    public EstadoSemaforo abrir() {
        return new TriestableAmarillo();
    }

    @Override
    public EstadoSemaforo cerrar() {
        throw new IllegalStateException("Transición no válida.");
    }
}
