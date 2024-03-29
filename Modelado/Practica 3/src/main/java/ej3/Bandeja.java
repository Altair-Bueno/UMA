package ej3;

import java.util.LinkedList;
import java.util.Queue;

public class Bandeja {
  // Attributes
  Queue<Pieza> pieza;
  int capacidad;
  EstadoBandeja estado;

  // Constructor
  public Bandeja(int capacidad) {
    assert capacidad > 0;
    // Inicialmente la bandeja esta vacia.
    estado = new Vacio();
    pieza = new LinkedList<>();
    this.capacidad = capacidad;
  }

  // Methods
  public void put(Pieza pieza) {
    estado.put(pieza, this);
  }

  public Pieza get() {
    return estado.get(this);
  }

  public int size() {
    return pieza.size();
  }

  public int getCapacidad() {
    return capacidad;
  }
}
