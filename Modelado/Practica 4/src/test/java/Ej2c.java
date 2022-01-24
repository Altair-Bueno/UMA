import Ej2c.Transformador.Transformador;
import org.junit.Test;

import java.util.Locale;

public class Ej2c {
    @Test
    public void test1(){
        Transformador t = new Transformador();
        assert t.estado().equals("Rojo");
        t.abrir();
        assert t.estado().equals("Verde");
        t.cerrar();
        assert t.estado().equals("Rojo");
        t.cambio();
        assert t.estado().equals("Rojo");
        t.abrir();
        assert t.estado().equals("Amarillo");
        t.abrir();
        assert t.estado().equals("Verde");
        t.cambio();
        assert t.estado().equals("Verde");
        t.cerrar();
        assert t.estado().equals("Rojo");
    }

    @Test (expected = IllegalStateException.class)
    public void test2(){
        Transformador t = new Transformador();
        assert t.estado().equals("Rojo");
        t.cerrar();
    }

    @Test (expected = IllegalStateException.class)
    public void test3(){
        Transformador t = new Transformador();
        assert t.estado().equals("Rojo");
        t.abrir();
        assert t.estado().equals("Verde");
        t.abrir();
    }

    @Test (expected = IllegalStateException.class)
    public void test4(){
        Transformador t = new Transformador();
        assert t.estado().equals("Rojo");
        t.abrir();
        assert t.estado().equals("Verde");
        t.cambio();
        assert t.estado().equals("Verde");
        t.abrir();
    }

    @Test (expected = IllegalStateException.class)
    public void test5(){
        Transformador t = new Transformador();
        assert t.estado().equals("Rojo");
        t.abrir();
        assert t.estado().equals("Verde");
        t.cambio();
        assert t.estado().equals("Verde");
        t.cerrar();
        assert t.estado().equals("Amarillo");
        t.cambio();
    }

    @Test (expected = IllegalStateException.class)
    public void test6(){
        Transformador t = new Transformador();
        assert t.estado().equals("Rojo");
        t.abrir();
        assert t.estado().equals("Verde");
        t.cambio();
        assert t.estado().equals("Verde");
        t.cerrar();
        assert t.estado().equals("Amarillo");
        t.cerrar();
        assert t.estado().equals("Rojo");
        t.cerrar();
    }


}
