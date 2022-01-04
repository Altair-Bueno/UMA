package ej3;

class Normal implements EstadoBandeja {
  @Override
  public void put(Pieza pieza, Bandeja bandeja) {
    assert bandeja != null;
    assert pieza != null;
    assert bandeja.pieza.size() < bandeja.capacidad;
    assert bandeja.pieza.size() > 0;
    assert (!bandeja.pieza.contains(pieza));

    var sizePre = bandeja.pieza.size();
    bandeja.pieza.add(pieza);
    if (bandeja.pieza.size() == bandeja.capacidad) bandeja.estado = new Lleno();

    assert (bandeja.pieza.contains(pieza));
    assert sizePre == bandeja.pieza.size() - 1;
  }

  @Override
  public Pieza get(Bandeja bandeja) {
    assert bandeja != null;
    assert bandeja.pieza.size() < bandeja.capacidad;
    assert bandeja.pieza.size() > 0;

    var sizePre = bandeja.pieza.size();
    Pieza pieza = bandeja.pieza.remove();
    if (bandeja.pieza.isEmpty()) bandeja.estado = new Vacio();

    assert (!bandeja.pieza.contains(pieza));
    assert sizePre == bandeja.pieza.size() + 1;

    return pieza;
  }
}
