package ej3;

import java.util.LinkedList;
import java.util.Queue;

public class Bandeja {
  protected Queue<Pieza> listaPiezas;
  int capacidad;
  EstadoBandeja estado;

  public Bandeja(int cap) {
    assert cap > 0;
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
