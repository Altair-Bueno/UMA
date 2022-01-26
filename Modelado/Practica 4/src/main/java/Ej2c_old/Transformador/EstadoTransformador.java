package Ej2c_old.Transformador;
import Ej2c_old.EstadoSemaforo;

public interface EstadoTransformador {
    void cambio(Transformador transformador);
    EstadoSemaforo getTraducido(Transformador transformador);

}
