package ej3;

import java.util.LinkedList;
import java.util.Queue;

public class Bandeja {
    int capacidad;
    protected Queue<Pieza> listaPiezas;
    EstadoBandeja estado;

    public Bandeja(int cap) {
        // Inicialmente la bandeja esta vacia.
        estado = new Vacio();
        listaPiezas = new LinkedList<>();
        capacidad = cap;
    }

    public void put(Pieza pieza) throws IllegalActionException {
        estado.put(pieza, this);
    }

    public Pieza get() throws IllegalActionException {
        return estado.get(this);
    }

    public int size() {
        return capacidad;
    }
}
