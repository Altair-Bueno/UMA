package ej1;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class Profesional {
    private Set<Acceso> acceso;

    public Profesional(){
        acceso = new HashSet<>();
    }

    Acceso getAcceso(Expediente e){
        for(Acceso a : acceso){
            if(a.getExpediente().equals(e)){
                return a;
            }
        }
        return null;
    }
    void addAcceso(Acceso a) {
        acceso.add(a);
    }

    public Enumeration<Acceso> getAccesos() {
        return Collections.enumeration(acceso);
    }
}
