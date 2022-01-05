package ej1;

import java.util.Date;

public class Acceso {
  // Attributes
  private Expediente expediente;
  private Profesional profesional;

  private Date fecha;
  private TipoAcceso tipo;

  // Constructor
  private Acceso(Profesional profesional, Expediente expediente, TipoAcceso tipoAcceso) {
    this.fecha = new Date(System.currentTimeMillis());
    this.profesional = profesional;
    this.expediente = expediente;
    this.tipo = tipoAcceso;
  }
  // Methods
  public static Acceso crearAcceso(
      Profesional profesional, Expediente expediente, TipoAcceso tipoAcceso) {
    assert profesional != null;
    assert expediente != null;
    assert tipoAcceso != null;

    Acceso acceso;
    if (profesional.getAcceso(expediente) == null) {
      acceso = new Acceso(profesional, expediente, tipoAcceso);
      profesional.addAcceso(acceso);
      expediente.addAcceso(acceso);
    } else {
      acceso = profesional.getAcceso(expediente);
      acceso.fecha = new Date(System.currentTimeMillis());
      acceso.tipo = tipoAcceso;
    }

    assert profesional.getAcceso(expediente) != null;
    assert expediente.getAcceso(profesional) != null;
    return acceso;
  }

  public Expediente getExpediente() {
    return expediente;
  }

  public Profesional getProfesional() {
    return profesional;
  }

  public Date getFecha() {
    return fecha;
  }

  public TipoAcceso getTipo() {
    return tipo;
  }
}
