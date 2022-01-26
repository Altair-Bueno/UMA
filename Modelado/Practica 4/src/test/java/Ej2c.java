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


    @Test (expected = IllegalStateException.class)
    public void test2(){
        MediadorBiestableTriestable mediador = new MediadorBiestableTriestable();
        assert mediador.estado().equals("cerrado");
        mediador.cerrar();
    }

    @Test (expected = IllegalStateException.class)
    public void test3(){
        MediadorBiestableTriestable mediador = new MediadorBiestableTriestable();
        assert mediador.estado().equals("cerrado");
        mediador.abrir();
        assert mediador.estado().equals("abierto");
        mediador.abrir();
    }

    @Test (expected = IllegalStateException.class)
    public void test4(){
        MediadorBiestableTriestable mediador = new MediadorBiestableTriestable();
        assert mediador.estado().equals("cerrado");
        mediador.abrir();
        assert mediador.estado().equals("abierto");
        mediador.cambiar();
        assert mediador.estado().equals("abierto");
        mediador.abrir();
    }

    @Test (expected = IllegalStateException.class)
    public void test5(){
        MediadorBiestableTriestable mediador = new MediadorBiestableTriestable();
        assert mediador.estado().equals("cerrado");
        mediador.abrir();
        assert mediador.estado().equals("abierto");
        mediador.cambiar();
        assert mediador.estado().equals("abierto");
        mediador.cerrar();
        assert mediador.estado().equals("precaución");
        mediador.cambiar();
    }

    @Test (expected = IllegalStateException.class)
    public void test6(){
        MediadorBiestableTriestable mediador = new MediadorBiestableTriestable();
        assert mediador.estado().equals("cerrado");
        mediador.abrir();
        assert mediador.estado().equals("abierto");
        mediador.cambiar();
        assert mediador.estado().equals("abierto");
        mediador.cerrar();
        assert mediador.estado().equals("precaución");
        mediador.cerrar();
        assert mediador.estado().equals("cerrado");
        mediador.cerrar();
    }




}
