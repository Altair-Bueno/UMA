package Ej2b_old.Triestable;

import Ej2b_old.EstadoSemaforo;
import Ej2b_old.Semaforo;

public class Triestable extends Semaforo {
    public Triestable(){
        super();
    }

    @Override
    protected EstadoSemaforo getEstadoInicial() {
        return new TriestableRojo();
    }
}
