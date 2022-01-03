package ej3;

public class Normal implements EstadoBandeja{
    @Override
    public void put(Pieza pieza, Bandeja bandeja) {
    // TODO assert pieza no está ya dentro
    bandeja.listaPiezas.add(pieza);
        comprobarEstado(bandeja);
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        Pieza p = bandeja.listaPiezas.remove();
        comprobarEstado(bandeja);
        return p;
    }

    private void comprobarEstado(Bandeja bandeja){
        if(bandeja.listaPiezas.isEmpty()) bandeja.estado = new Vacio();
        else if(bandeja.listaPiezas.size() == bandeja.capacidad) bandeja.estado = new Lleno();
        else bandeja.estado = new Normal();
    }
}
