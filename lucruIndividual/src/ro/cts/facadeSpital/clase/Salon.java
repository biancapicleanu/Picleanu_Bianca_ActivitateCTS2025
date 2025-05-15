package ro.cts.facadeSpital.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> listaPaturiLibere;

    public Salon() {
        this.listaPaturiLibere =new ArrayList<>();
    }
    public boolean verificaDisponibilitatePaturi(Pacient pacient, Medic medic){
        return medic.verificaStarePacient(pacient) && !listaPaturiLibere.isEmpty();
    }
}
