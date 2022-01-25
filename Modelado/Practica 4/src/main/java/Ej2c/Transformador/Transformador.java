package Ej2c.Transformador;
import Ej2c.Biestable.BiestableRojo;
import Ej2c.EstadoSemaforo;
import Ej2c.Semaforo;

public class Transformador extends Semaforo{
    EstadoTransformador estadoTransformador;

    public Transformador(){
        estadoTransformador = new EstadoBiestable();
    }

    @Override
    protected EstadoSemaforo getEstadoInicial() {
        return new BiestableRojo();
    }

  @Override
  protected void setEstadoSemaforo(EstadoSemaforo estado) {
    super.setEstadoSemaforo(estado);
    }

    public void cambio(){
        EstadoSemaforo estado = estadoTransformador.getTraducido(this);
        estadoTransformador.cambio(this);
    setEstadoSemaforo(estado);
    }
}
