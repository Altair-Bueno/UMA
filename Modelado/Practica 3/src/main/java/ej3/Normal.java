package ej3;

public class Normal implements EstadoBandeja{
    @Override
    public void put(Pieza pieza, Bandeja bandeja) {
        bandeja.listaPiezas.add(pieza);
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        Pieza p = bandeja.listaPiezas.remove();
        return p;
    }
}
