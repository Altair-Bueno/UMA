package Ej2b.Triestable;

import Ej2b.EstadoSemaforo;
import Ej2b.Semaforo;

public class Triestable extends Semaforo {
    public Triestable(){
        super();
    }

    @Override
    protected EstadoSemaforo getEstadoInicial() {
        return new TriestableRojo();
    }
}
