package Ej2c_old.Transformador;

import Ej2c_old.Biestable.BiestableRojo;
import Ej2c_old.Biestable.BiestableVerde;
import Ej2c_old.EstadoSemaforo;
import Ej2c_old.Triestable.TriestableRojo;
import Ej2c_old.Triestable.TriestableVerde;

public class EstadoTriestable implements EstadoTransformador{
    @Override
    public void cambio(Transformador transformador) {
        transformador.estadoTransformador = new EstadoBiestable();
    }

    @Override
    public EstadoSemaforo getTraducido(Transformador transformador) {
    var estado = transformador.getEstado();
    if (estado instanceof TriestableVerde) return new BiestableVerde();
    else if (estado instanceof TriestableRojo) return new BiestableRojo();
    else throw new IllegalStateException();
    }
}
