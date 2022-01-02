package ej3;

public class Vacio implements EstadoBandeja{
    @Override
    public void put(Pieza pieza, Bandeja bandeja) {
        bandeja.listaPiezas.add(pieza);
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        System.err.println("No hay piezas disponibles.");
        return null;
    }
}
