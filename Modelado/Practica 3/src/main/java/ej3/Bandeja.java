package ej3;

import java.util.*;

public class Bandeja {
    int capacidad;
    protected SortedSet<Pieza> listaPiezas;
    EstadoBandeja estado;

    public Bandeja(int cap){
        estado = new Vacio(); //Inicialmente la bandeja esta vacia.
        listaPiezas = new TreeSet<>();
        capacidad = cap;
    }

    public void put(Pieza pieza){
        estado.put(pieza,this);
        comprobarEstado();
    }

    public Pieza get(){
        Pieza p = estado.get(this);
        comprobarEstado();
        return p;
    }

    public int size(){
        return capacidad;
    }

    private void comprobarEstado(){
        if(listaPiezas.isEmpty()) estado = new Vacio();
        else if(listaPiezas.size() == capacidad) estado = new Lleno();
        else estado = new Normal();
    }
}
