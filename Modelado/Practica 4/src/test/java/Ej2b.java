import Ej2b.Biestable.Biestable;
import Ej2b.Triestable.Triestable;
import org.junit.Test;
import Ej2b.*;

public class Ej2b {
    @Test (expected = IllegalStateException.class)
    public void testBiestable1(){
        Semaforo s = new Biestable();
        s.abrir();
        s.abrir();
    }

    @Test (expected = IllegalStateException.class)
    public void testBiestable2(){
        Semaforo s = new Biestable();
        s.cerrar();
    }

    @Test
    public void testBiestable3(){
        Semaforo s = new Biestable();
        s.abrir();
        assert s.estado().equals("Verde");
        s.cerrar();
        assert s.estado().equals("Rojo");
        s.abrir();
        assert s.estado().equals("Verde");
    }

    @Test (expected = IllegalStateException.class)
    public void testTriestable1(){
        Semaforo s = new Triestable();
        assert s.estado().equals("Rojo");
        s.cerrar();
    }

    @Test (expected = IllegalStateException.class)
    public void testTriestable2(){
        Semaforo s = new Triestable();
        assert s.estado().equals("Rojo");
        s.abrir();
        assert s.estado().equals("Amarillo");
        s.abrir();
        assert s.estado().equals("Verde");
        s.abrir();
    }

    @Test
    public void testTriestable3(){
        Semaforo s = new Triestable();
        assert s.estado().equals("Rojo");
        s.abrir();
        assert s.estado().equals("Amarillo");
        s.abrir();
        assert s.estado().equals("Verde");
        s.cerrar();
        assert s.estado().equals("Amarillo");
        s.cerrar();
        assert s.estado().equals("Rojo");
    }


}
