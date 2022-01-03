package ej3;

public class Vacio implements EstadoBandeja {
    @Override
    public void put(Pieza pieza, Bandeja bandeja) {
        assert (!bandeja.listaPiezas.contains(pieza));

        bandeja.listaPiezas.add(pieza);
        if (bandeja.listaPiezas.size() == bandeja.capacidad) bandeja.estado = new Lleno();
        else bandeja.estado = new Normal();

        assert (bandeja.listaPiezas.contains(pieza));
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        throw new IllegalActionException("Bandeja vacia.");
    }
}
