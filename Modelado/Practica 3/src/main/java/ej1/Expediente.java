package ej1;

import java.util.HashSet;
import java.util.Set;

public class Expediente {
    private Paciente paciente;
    private Set<Acceso> acceso;


    Expediente(Paciente p){
        assert(p != null);

        acceso = new HashSet<Acceso>();
        this.paciente = p;
    }

    Acceso getAcceso(Expediente e){
        for(Acceso a : acceso){
            if(a.getExpediente().equals(e)){
                return a;
            }
        }
        return null;
    }

    public Set<Acceso> getSetAccesos(){
        return acceso;
    }

    public Paciente getPaciente(){
        return paciente;
    }

}
