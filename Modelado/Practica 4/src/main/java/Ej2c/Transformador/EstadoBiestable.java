package Ej2c.Transformador;
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
        return switch(transformador.estado()){
            case "abierto"-> new TriestableVerde();
            case "cerrado"-> new TriestableRojo();
            default->throw new IllegalStateException();
        };
    }
}
