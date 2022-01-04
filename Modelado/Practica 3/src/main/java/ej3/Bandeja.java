package ej3;

import java.util.LinkedList;
import java.util.Queue;

public class Bandeja {
  Queue<Pieza> listaPiezas;
  int capacidad;
  EstadoBandeja estado;

  public Bandeja(int capacidad) {
    assert capacidad > 0;
    // Inicialmente la bandeja esta vacia.
    estado = new Vacio();
    listaPiezas = new LinkedList<>();
    this.capacidad = capacidad;
  }

  public void put(Pieza pieza) {
    estado.put(pieza, this);
  }

  public Pieza get() {
    return estado.get(this);
  }

  public int size() {
    return listaPiezas.size();
  }
}
