package ej3;

import java.util.*;

public class Bandeja {
    int capacidad;
    protected Queue<Pieza> listaPiezas;
    EstadoBandeja estado;

    public Bandeja(int cap){
        estado = new Vacio(); //Inicialmente la bandeja esta vacia.
        listaPiezas = new LinkedList<>();
        capacidad = cap;
    }

    public void put(Pieza pieza) throws IllegalActionException {
        estado.put(pieza,this);
    }

    public Pieza get() throws IllegalActionException {
        return estado.get(this);
    }

    public int size(){
        return capacidad;
    }
}
