package ej3;

class Lleno implements EstadoBandeja {
  @Override
  public void put(Pieza pieza, Bandeja bandeja) {
    throw new IllegalStateException("Bandeja llena");
  }

  @Override
  public Pieza get(Bandeja bandeja) {
    assert bandeja != null;
    assert bandeja.pieza.size() == bandeja.capacidad;

    Pieza pieza = bandeja.pieza.remove();
    bandeja.estado = bandeja.pieza.isEmpty() ? new Vacio() : new Normal();

    assert !bandeja.pieza.contains(pieza);
    assert bandeja.pieza.size() == bandeja.capacidad - 1;
    return pieza;
  }
}
