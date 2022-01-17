package Ej2.b;

public abstract class EstadoTriestable {
    abstract void abrir();
    abstract void cerrar();
    abstract String estado();

    Mediador mediador;
}
