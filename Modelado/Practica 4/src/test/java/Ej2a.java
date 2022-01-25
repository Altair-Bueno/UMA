import Ej2a.Biestable;
import org.junit.Test;

public class Ej2a {
    @Test
    public void cambioDeEstadosCorrecto(){
        Biestable b = new Biestable();
        assert b.estado().equals("cerrado");
        b.abrir();
        assert b.estado().equals("abierto");
        b.cerrar();
        assert b.estado().equals("cerrado");
    }

    @Test (expected = IllegalStateException.class)
    public void noPuedeCerrarEnRojo(){
        Biestable b = new Biestable();
        b.cerrar();
    }

    @Test (expected = IllegalStateException.class)
    public void noPuedeAbrirEnVerde(){
        Biestable b = new Biestable();
        b.abrir();
        b.abrir();
    }
}
