package ej2;

public class Activo extends Trabajador {
  // Constructor
  public Activo(String nombre, String numeroSeguridadSocial, double salario) {
    super(nombre, numeroSeguridadSocial, salario);
  }

  // Methods
  @Override
  public void incrementar() {
    this.salario *= 1.02;
  }
}
