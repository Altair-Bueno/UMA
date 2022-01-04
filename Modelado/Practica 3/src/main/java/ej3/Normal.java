package ej3;

public class Normal implements EstadoBandeja {
    @Override
    public void put(Pieza pieza, Bandeja bandeja) {
    assert bandeja != null;
    assert pieza != null;
    assert bandeja.listaPiezas.size() < bandeja.capacidad;
    assert bandeja.listaPiezas.size() > 0;
        assert (!bandeja.listaPiezas.contains(pieza));

    var sizePre = bandeja.listaPiezas.size();
        bandeja.listaPiezas.add(pieza);
    if (bandeja.listaPiezas.size() == bandeja.capacidad) bandeja.estado = new Lleno();

        assert (bandeja.listaPiezas.contains(pieza));
    assert sizePre == bandeja.listaPiezas.size() - 1;
    }

    @Override
    public Pieza get(Bandeja bandeja) {
    assert bandeja != null;
    assert bandeja.listaPiezas.size() < bandeja.capacidad;
    assert bandeja.listaPiezas.size() > 0;

    var sizePre = bandeja.listaPiezas.size();
        Pieza p = bandeja.listaPiezas.remove();
    if (bandeja.listaPiezas.isEmpty()) bandeja.estado = new Vacio();

        assert(!bandeja.listaPiezas.contains(p));
    assert sizePre == bandeja.listaPiezas.size() + 1;

        return p;
    }
}
