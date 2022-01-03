package ej3;

public interface EstadoBandeja {
    public void put(Pieza pieza, Bandeja bandeja) throws IllegalActionException;
    public Pieza get(Bandeja bandeja) throws IllegalActionException;
}
