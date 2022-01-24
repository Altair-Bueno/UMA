package Ej2c.Triestable;

import Ej2c.EstadoSemaforo;
import Ej2c.Semaforo;

public class Triestable extends Semaforo {
    public Triestable(){
        super();
    }

    @Override
    protected EstadoSemaforo getEstadoInicial() {
        return new TriestableRojo();
    }
}
