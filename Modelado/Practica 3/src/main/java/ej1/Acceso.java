package ej1;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class Acceso {
  private final Expediente expediente;
  private final Profesional accesor;

  private Date fecha;
  private TipoAcceso tipo;

  private Acceso(Profesional p, Expediente e, TipoAcceso t) {
    this.fecha = new Date(System.currentTimeMillis());
    this.accesor = p;
    this.expediente = e;
    this.tipo = t;
  }

  public static Acceso crearAcceso(Profesional p, Expediente e, TipoAcceso t) {
    // Precondiciones
    assert (p != null);
    assert (e != null);
    assert (t != null);

    // Si un profesional nunca ha accedido, se crea el acceso y se añade a la lista.
    if (p.getAcceso(e) == null) {
      int tampre = Collections.list(p.getAccesos()).size();

      Acceso a = new Acceso(p, e, t);
      p.addAcceso(a);
      e.addAcceso(a);

      // Postcondiciones

      //    1. La lista de accesos ha mutado

      //    1. El acceso 'a' añadido solamente está una vez en la lista de accesos del profesional.
      int cont = 0;
      for (Iterator<Acceso> it = p.getAccesos().asIterator(); it.hasNext(); ) {
        Acceso a1 = it.next();
        if(a1.equals(a)){cont++;}
      }
      assert (cont == 1);

      //    2. El acceso 'a' añadido solamente está una vez en la lista de accesos del expediente.
      cont = 0;
      for (Iterator<Acceso> it = e.getAccesos().asIterator(); it.hasNext(); ) {
        Acceso a1 = it.next();
        if(a1.equals(a)){cont++;}
      }
      assert (cont == 1);

      return a;
    } else {
      // Si ya lo habia hecho, se modifica el acceso.
      Acceso a = p.getAcceso(e);
      a.fecha = new Date(System.currentTimeMillis());
      a.tipo = t;
      return a;
    }


  }

  public Expediente getExpediente() {
    return expediente;
  }

  public Profesional getProfesional() {
    return accesor;
  }

  public Date getFecha() {
    return fecha;
  }

  public TipoAcceso getTipo() {
    return tipo;
  }
}
