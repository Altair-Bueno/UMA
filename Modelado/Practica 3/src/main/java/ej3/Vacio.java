package ej3;

public class Vacio implements EstadoBandeja{
    @Override
    public void put(Pieza pieza, Bandeja bandeja) {
    // TODO assert pieza no está ya dentro
    bandeja.listaPiezas.add(pieza);
        comprobarEstado(bandeja);
    }

    @Override
    public Pieza get(Bandeja bandeja) throws IllegalActionException {
        throw new IllegalActionException("Bandeja vacia.");
    }

    private void comprobarEstado(Bandeja bandeja){
        if(bandeja.listaPiezas.isEmpty()) bandeja.estado = new Vacio();
        else if(bandeja.listaPiezas.size() == bandeja.capacidad) bandeja.estado = new Lleno();
        else bandeja.estado = new Normal();
    }
}
