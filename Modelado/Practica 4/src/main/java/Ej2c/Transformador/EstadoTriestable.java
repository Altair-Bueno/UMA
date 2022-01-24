package Ej2c.Transformador;
import Ej2c.Biestable.BiestableRojo;
import Ej2c.Biestable.BiestableVerde;
import Ej2c.EstadoSemaforo;

public class EstadoTriestable implements EstadoTransformador{
    @Override
    public void cambio(Transformador transformador) {
        transformador.estadoTransformador = new EstadoBiestable();
    }

    @Override
    public EstadoSemaforo getTraducido(Transformador transformador) {
        return switch(transformador.estado()){
            case "Verde"-> new BiestableVerde();
            case "Rojo"-> new BiestableRojo();
            default->throw new IllegalStateException();
        };
    }
}
