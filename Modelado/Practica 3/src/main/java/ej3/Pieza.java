package ej3;

public class Pieza implements Comparable<Pieza>{
    int id;

    public Pieza(int id){
        this.id = id;
    }


    @Override
    public int compareTo(Pieza o) {
        return this.id - o.id;
    }
}
