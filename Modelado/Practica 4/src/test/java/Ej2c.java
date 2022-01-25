import Ej2c.Transformador.Transformador;
import org.junit.Test;

import java.util.Locale;

public class Ej2c {
    @Test
    public void test1(){
        Transformador t = new Transformador();
        assert t.estado().equals("cerrado");
        t.abrir();
        assert t.estado().equals("abierto");
        t.cerrar();
        assert t.estado().equals("cerrado");
        t.cambio();
        assert t.estado().equals("cerrado");
        t.abrir();
        assert t.estado().equals("precaución");
        t.abrir();
        assert t.estado().equals("abierto");
        t.cambio();
        assert t.estado().equals("abierto");
        t.cerrar();
        assert t.estado().equals("cerrado");
    }

    @Test (expected = IllegalStateException.class)
    public void test2(){
        Transformador t = new Transformador();
        assert t.estado().equals("cerrado");
        t.cerrar();
    }

    @Test (expected = IllegalStateException.class)
    public void test3(){
        Transformador t = new Transformador();
        assert t.estado().equals("cerrado");
        t.abrir();
        assert t.estado().equals("abierto");
        t.abrir();
    }

    @Test (expected = IllegalStateException.class)
    public void test4(){
        Transformador t = new Transformador();
        assert t.estado().equals("cerrado");
        t.abrir();
        assert t.estado().equals("abierto");
        t.cambio();
        assert t.estado().equals("abierto");
        t.abrir();
    }

    @Test (expected = IllegalStateException.class)
    public void test5(){
        Transformador t = new Transformador();
        assert t.estado().equals("cerrado");
        t.abrir();
        assert t.estado().equals("abierto");
        t.cambio();
        assert t.estado().equals("abierto");
        t.cerrar();
        assert t.estado().equals("precaución");
        t.cambio();
    }

    @Test (expected = IllegalStateException.class)
    public void test6(){
        Transformador t = new Transformador();
        assert t.estado().equals("cerrado");
        t.abrir();
        assert t.estado().equals("abierto");
        t.cambio();
        assert t.estado().equals("abierto");
        t.cerrar();
        assert t.estado().equals("precaución");
        t.cerrar();
        assert t.estado().equals("cerrado");
        t.cerrar();
    }


}
