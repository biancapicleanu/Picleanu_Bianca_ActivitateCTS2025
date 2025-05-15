package ro.cts.facadeSpital.clase;

import java.util.ArrayList;

public class Facade {
    public String verificareInternare(Pacient pacient){
        Medic medic=new Medic();
        Salon salon=new Salon();
        if(pacient.isAreStareGrava()){
            if(medic.verificaStarePacient(pacient)){
                if (salon.verificaDisponibilitatePaturi(pacient,medic)){
                    return "Va rog sa ocupati patul";
                } else {return "Nu exista pat disponibil";}
            } else {return "Medicul nu poate confirma starea pacientului";}
        } else {
            return "Starea pacientului nu este grava, nu necesita internare";
        }

    }
}
