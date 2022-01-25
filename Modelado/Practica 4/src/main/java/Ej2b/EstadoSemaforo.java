package Ej2b;

public interface EstadoSemaforo {
    /**
     * @return Cadena de caracteres que representa al estado
     */
    public String estado();

    /**
     * @return Estado siguiente a este
     */
    public EstadoSemaforo abrir();

    /**
     * @return Estado anterior a este
     */
    public EstadoSemaforo cerrar();
}
