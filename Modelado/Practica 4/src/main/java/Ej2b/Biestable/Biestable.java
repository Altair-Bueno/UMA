package Ej2b.Biestable;

import Ej2b.EstadoSemaforo;
import Ej2b.Semaforo;

public class Biestable extends Semaforo {
    public Biestable(){
        super();
    }

    @Override
    protected EstadoSemaforo getEstadoInicial() {
        return new BiestableRojo();
    }
}
