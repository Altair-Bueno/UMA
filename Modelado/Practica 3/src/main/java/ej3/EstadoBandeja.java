package ej3;

interface EstadoBandeja {
  void put(Pieza pieza, Bandeja bandeja);

  Pieza get(Bandeja bandeja);
}
