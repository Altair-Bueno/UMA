package ej2;

public abstract class Trabajador {
    //Attributes
    private String nombre;
    private String numeroSeguridadSocial;
    protected double salario;

    //Constructor
    public Trabajador(String nombre, String numeroSeguridadSocial, double salario){
        assert nombre != null && !nombre.equals("");
        assert numeroSeguridadSocial != null;
        assert salario >= 0;

        this.nombre=nombre;
        this.numeroSeguridadSocial=numeroSeguridadSocial;
        this.salario=salario;
    }

    //Methods
    public double nomina() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNombre(String nombre) {
        assert nombre != null && !nombre.equals("");
        this.nombre = nombre;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        assert numeroSeguridadSocial != null;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public abstract void incrementar();
}
