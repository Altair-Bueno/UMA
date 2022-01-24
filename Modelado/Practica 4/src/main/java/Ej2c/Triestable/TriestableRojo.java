package Ej2c.Triestable;

import Ej2c.EstadoSemaforo;
import Ej2c.Rojo;

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
