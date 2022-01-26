package Ej2c_old.Biestable;

import Ej2c_old.EstadoSemaforo;
import Ej2c_old.Semaforo;

public class Biestable extends Semaforo {
    public Biestable(){
        super();
    }

    @Override
    protected EstadoSemaforo getEstadoInicial() {
        return new BiestableRojo();
    }
}
