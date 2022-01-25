import Ej2a.Biestable;
import org.junit.Test;

public class Ej2a {
    @Test
    public void test1(){
        Biestable b = new Biestable();
    assert b.estado().equals("cerrado");
        b.abrir();
    assert b.estado().equals("abierto");
    }

    @Test (expected = IllegalStateException.class)
    public void test2(){
        Biestable b = new Biestable();
        b.cerrar();
    }

    @Test (expected = IllegalStateException.class)
    public void test3(){
        Biestable b = new Biestable();
        b.abrir();
        b.abrir();
    }
}
