package ej3;

class Vacio implements EstadoBandeja {
  @Override
  public void put(Pieza pieza, Bandeja bandeja) {
    assert pieza != null;
    assert bandeja != null;
    assert bandeja.pieza.size() == 0;

    bandeja.pieza.add(pieza);
    if (bandeja.pieza.size() == bandeja.capacidad) bandeja.estado = new Lleno();
    else bandeja.estado = new Normal();

    assert bandeja.pieza.contains(pieza);
    assert bandeja.pieza.size() == 1;
  }

  @Override
  public Pieza get(Bandeja bandeja) {
    throw new IllegalStateException("Bandeja vacia.");
  }
}
