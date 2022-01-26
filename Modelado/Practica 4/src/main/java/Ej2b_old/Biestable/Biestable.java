package Ej2b_old.Biestable;

import Ej2b_old.EstadoSemaforo;
import Ej2b_old.Semaforo;

public class Biestable extends Semaforo {
    public Biestable(){
        super();
    }

    @Override
    protected EstadoSemaforo getEstadoInicial() {
        return new BiestableRojo();
    }
}
