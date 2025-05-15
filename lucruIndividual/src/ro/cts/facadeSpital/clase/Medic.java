package ro.cts.facadeSpital.clase;

public class Medic {
    public boolean verificaStarePacient(Pacient pacient){
        return pacient.isAreStareGrava();
    }
}
