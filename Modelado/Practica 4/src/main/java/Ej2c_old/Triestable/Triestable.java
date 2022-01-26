package Ej2c_old.Triestable;

import Ej2c_old.EstadoSemaforo;
import Ej2c_old.Semaforo;

public class Triestable extends Semaforo {
    public Triestable(){
        super();
    }

    @Override
    protected EstadoSemaforo getEstadoInicial() {
        return new TriestableRojo();
    }
}
