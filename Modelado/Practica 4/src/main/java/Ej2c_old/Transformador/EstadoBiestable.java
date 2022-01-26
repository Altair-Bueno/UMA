package Ej2c_old.Transformador;

import Ej2c_old.Biestable.BiestableRojo;
import Ej2c_old.Biestable.BiestableVerde;
import Ej2c_old.EstadoSemaforo;
import Ej2c_old.Triestable.TriestableRojo;
import Ej2c_old.Triestable.TriestableVerde;

public class EstadoBiestable implements EstadoTransformador{
    @Override
    public void cambio(Transformador transformador) {
        transformador.estadoTransformador = new EstadoTriestable();
    }

    @Override
    public EstadoSemaforo getTraducido(Transformador transformador) {
    var estado = transformador.getEstado();
    if (estado instanceof BiestableVerde) return new TriestableVerde();
    else if (estado instanceof BiestableRojo) return new TriestableRojo();
    else throw new IllegalStateException();
    }
}
