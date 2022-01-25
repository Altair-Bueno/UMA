package Ej2c.Transformador;

import Ej2c.Biestable.BiestableRojo;
import Ej2c.Biestable.BiestableVerde;
import Ej2c.EstadoSemaforo;
import Ej2c.Triestable.TriestableRojo;
import Ej2c.Triestable.TriestableVerde;

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
