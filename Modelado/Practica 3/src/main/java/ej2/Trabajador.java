package ej2;

public abstract class Trabajador {
  // Attributes
  protected double salario;
  private String nombre;
  private String numeroSeguridadSocial;

  // Constructor
  public Trabajador(String nombre, String numeroSeguridadSocial, double salario) {
    assert nombre != null;
    assert !nombre.equals("");
    assert numeroSeguridadSocial != null;
    assert !numeroSeguridadSocial.equals("");
    assert salario >= 0;

    this.nombre = nombre;
    this.numeroSeguridadSocial = numeroSeguridadSocial;
    this.salario = salario;
  }

  // Methods
  public double nomina() {
    return salario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    assert nombre != null;
    assert !nombre.equals("");
    this.nombre = nombre;
  }

  public String getNumeroSeguridadSocial() {
    return numeroSeguridadSocial;
  }

  public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
    assert numeroSeguridadSocial != null;
    assert !numeroSeguridadSocial.equals("");
    this.numeroSeguridadSocial = numeroSeguridadSocial;
  }

  public abstract void incrementar();
}
