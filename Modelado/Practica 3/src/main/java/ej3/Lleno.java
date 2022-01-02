package ej3;

public class Lleno implements EstadoBandeja{
    @Override
    public void put(Pieza pieza, Bandeja bandeja) {
        System.err.println("ERROR: Bandeja llena.");
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        Pieza p = bandeja.listaPiezas.remove();
        return p;
    }
}
