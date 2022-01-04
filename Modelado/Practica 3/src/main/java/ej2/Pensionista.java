package ej2;

public class Pensionista extends Trabajador {

  // Constructor
  public Pensionista(String nombre, String numeroSeguridadSocial, double salario) {
    super(nombre, numeroSeguridadSocial, salario);
  }

  // Methods
  public void incrementar() {
    this.salario *= 1.04;
  }
}
