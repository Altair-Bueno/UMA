package ej3;

public class Normal implements EstadoBandeja {
    @Override
    public void put(Pieza pieza, Bandeja bandeja) {
        assert (!bandeja.listaPiezas.contains(pieza));

        bandeja.listaPiezas.add(pieza);
        if (bandeja.listaPiezas.size() == bandeja.capacidad) bandeja.estado = new Lleno();

        assert (bandeja.listaPiezas.contains(pieza));
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        Pieza p = bandeja.listaPiezas.remove();
        if (bandeja.listaPiezas.isEmpty()) bandeja.estado = new Vacio();

        assert(!bandeja.listaPiezas.contains(p));

        return p;
    }
}
