package Ej2c.Biestable;

import Ej2c.EstadoSemaforo;
import Ej2c.Semaforo;

public class Biestable extends Semaforo {
    public Biestable(){
        super();
    }

    @Override
    protected EstadoSemaforo getEstadoInicial() {
        return new BiestableRojo();
    }
}
