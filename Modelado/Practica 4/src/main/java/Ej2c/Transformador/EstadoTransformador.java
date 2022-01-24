package Ej2c.Transformador;
import Ej2c.EstadoSemaforo;

public interface EstadoTransformador {
    void cambio(Transformador transformador);
    EstadoSemaforo getTraducido(Transformador transformador);

}
