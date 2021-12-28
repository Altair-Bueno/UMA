package ej1;

import java.util.Date;

public class Acceso {
    private Expediente expediente;
    private Profesional accesor;

    private Date fecha;
    private TipoAcceso tipo;

    private Acceso(Profesional p, Expediente e, TipoAcceso t){
        //Precondiciones
        assert (p != null);
        assert (e != null);
        assert (t != null);

        this.fecha = new Date(System.currentTimeMillis());
        this.accesor = p;
        this.expediente = e;
        this.tipo = t;
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

    public static Acceso crearAcceso(Profesional p, Expediente e, TipoAcceso t){
        //Si un profesional ya ha accedido, se modifica, si nunca ha accedido, se crea.
        if(p.getAcceso(e) == null){
            Acceso a = new Acceso(p,e,t);
            p.addAcceso(a);
            e.addAcceso(a);
            return a;
        } else {
            //Si no, se crea y se añaden a la lista.
            Acceso a = p.getAcceso(e);
            a.fecha = new Date(System.currentTimeMillis());
            a.tipo = t;
            return a;
        }
    }
}
