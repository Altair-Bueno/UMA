import org.junit.Test;
import Ej2c.*;

public class Ej2c {
    @Test
    public void test1(){
        MediadorBiestableTriestable mediador = new MediadorBiestableTriestable();
        assert mediador.estado().equals("cerrado");
        mediador.abrir();
        assert mediador.estado().equals("abierto");
        mediador.cerrar();
        assert mediador.estado().equals("cerrado");
        mediador.cambiar();
        assert mediador.estado().equals("cerrado");
        mediador.abrir();
        assert mediador.estado().equals("precaución");
        mediador.abrir();
        assert mediador.estado().equals("abierto");
        mediador.cambiar();
        assert mediador.estado().equals("abierto");
        mediador.cerrar();
        assert mediador.estado().equals("cerrado");
    }

    /*
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

     */


}
