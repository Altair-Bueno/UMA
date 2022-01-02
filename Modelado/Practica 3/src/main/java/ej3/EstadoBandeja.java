package ej3;

public interface EstadoBandeja {
    public void put(Pieza pieza, Bandeja bandeja);
    public Pieza get(Bandeja bandeja);
}
