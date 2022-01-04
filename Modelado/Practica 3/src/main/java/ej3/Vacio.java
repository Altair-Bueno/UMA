package ej3;

public class Vacio implements EstadoBandeja {
  @Override
  public void put(Pieza pieza, Bandeja bandeja) {
    assert pieza != null;
    assert bandeja != null;
    assert bandeja.listaPiezas.size() == 0;

    bandeja.listaPiezas.add(pieza);
    if (bandeja.listaPiezas.size() == bandeja.capacidad) bandeja.estado = new Lleno();
    else bandeja.estado = new Normal();

    assert (bandeja.listaPiezas.contains(pieza));
    assert bandeja.listaPiezas.size() == 1;
  }

  @Override
  public Pieza get(Bandeja bandeja) {
    throw new IllegalActionException("Bandeja vacia.");
  }
}
