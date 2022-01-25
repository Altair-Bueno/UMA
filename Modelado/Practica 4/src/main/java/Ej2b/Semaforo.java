package Ej2b;

public abstract class Semaforo {
    /**
     * Representa el estado {@link EstadoSemaforo} actual del semáforo.
     */
    private EstadoSemaforo estado;

    /**
     * Crea un nuevo semáforo haciendo uso de {@link #setEstado(EstadoSemaforo)},
     * pasando como parámetro de la función el valor de retorno de {@link #getEstadoInicial()}.
     */
    public Semaforo(){
        setEstado(getEstadoInicial());
    }

    /**
     * Devuelve el estado actual del semáforo. Funciona como envoltorio
     * del método {@link EstadoSemaforo#estado()}.
     * @return Cadena de caracteres que representa el estado actual.
     */
    public String estado(){
        return estado.estado();
    }

    /**
     * Cambia el estado del semáforo, abriéndolo un nivel. Delega
     * la operación al método {@link EstadoSemaforo#abrir()}.
     */
    public void abrir(){
        setEstado(estado.abrir());
    }

    /**
     * Cambia el estado del semáforo, cerrándolo un nivel. Delega
     * la operación al método {@link EstadoSemaforo#cerrar()}.
     */
    public void cerrar(){
        setEstado(estado.cerrar());
    }

    /**
     * Establece el {@link EstadoSemaforo} que recibe por parámetro
     * como estado actual del semáforo.
     * @param estado {@link EstadoSemaforo} a establecer como estado
     *                                      del semáforo.
     */
    protected void setEstado(EstadoSemaforo estado){
        this.estado = estado;
    }

    /**
     * @return El estado actual del semáforo.
     */
    public EstadoSemaforo getEstadoSemaforo() {
        return estado;
    }

    /**
     * Este método será implementado por cada clase concreta que
     * extienda a {@link Semaforo}. El estado inicial dependerá
     * del funcionamiento concreto de cada semáforo.
     * <P></P>
     * A partir del estado inicial determinado por esta función,
     * compenzarán a funcionar los cambios de estado del semáforo
     * llamándose a los métodos {@link #abrir()} y {@link #cerrar()}.
     * @return El estado inicial del semáforo implementado.
     */
    protected abstract EstadoSemaforo getEstadoInicial();
}
