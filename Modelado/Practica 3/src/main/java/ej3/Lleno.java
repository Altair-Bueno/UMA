package ej3;

public class Lleno implements EstadoBandeja {
    @Override
    public void put(Pieza pieza, Bandeja bandeja) {
        throw new IllegalActionException("Bandeja llena");
    }

    @Override
    public Pieza get(Bandeja bandeja) {
    assert bandeja != null;
    assert bandeja.listaPiezas.size() == bandeja.capacidad;

        Pieza p = bandeja.listaPiezas.remove();
        if (bandeja.listaPiezas.isEmpty()) bandeja.estado = new Vacio();
        else bandeja.estado = new Normal();

        assert(!bandeja.listaPiezas.contains(p));
    assert bandeja.listaPiezas.size() == bandeja.capacidad - 1;
        return p;
    }
}
