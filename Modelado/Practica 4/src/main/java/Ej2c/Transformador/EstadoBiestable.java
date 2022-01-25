package Ej2c.Transformador;

import Ej2c.Biestable.BiestableRojo;
import Ej2c.Biestable.BiestableVerde;
import Ej2c.EstadoSemaforo;
import Ej2c.Triestable.TriestableRojo;
import Ej2c.Triestable.TriestableVerde;

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
