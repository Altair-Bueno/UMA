package ej1;

import java.util.HashSet;
import java.util.Set;

public class Profesional {
    private Set<Acceso> acceso;

    public Profesional(){
        acceso = new HashSet<Acceso>();
    }

    Acceso getAcceso(Expediente e){
        for(Acceso a : acceso){
            if(a.getExpediente().equals(e)){
                return a;
            }
        }
        return null;
    }

    public Set<Acceso> getSetAccesos() {
        return acceso;
    }
}
