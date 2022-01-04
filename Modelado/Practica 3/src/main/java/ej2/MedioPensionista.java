package ej2;

public class MedioPensionista extends Trabajador {
  // Attributes
  private Activo activo;
  private Pensionista pensionista;

  // Constructor
  public MedioPensionista(
      String nombre,
      String numeroSeguridadSocial,
      double salarioActivo,
      double salarioPensionista) {
    super(nombre, numeroSeguridadSocial, salarioActivo + salarioPensionista);
    this.activo = new Activo(nombre, numeroSeguridadSocial, salarioActivo);
    this.pensionista = new Pensionista(nombre, numeroSeguridadSocial, salarioPensionista);
  }

  // Methods
  public void incrementar() {
    this.activo.incrementar();
    this.pensionista.incrementar();
    this.salario = this.activo.salario + this.pensionista.salario;
  }

  @Override
  public void setNombre(String nombre) {
    super.setNombre(nombre);
    activo.setNombre(nombre);
    pensionista.setNombre(nombre);
  }

  @Override
  public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
    super.setNumeroSeguridadSocial(numeroSeguridadSocial);
    activo.setNumeroSeguridadSocial(numeroSeguridadSocial);
    pensionista.setNumeroSeguridadSocial(numeroSeguridadSocial);
  }
}
