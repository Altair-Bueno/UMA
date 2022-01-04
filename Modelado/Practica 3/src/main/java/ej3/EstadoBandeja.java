package ej3;

public interface EstadoBandeja {
    void put(Pieza pieza, Bandeja bandeja);
    Pieza get(Bandeja bandeja);
}
