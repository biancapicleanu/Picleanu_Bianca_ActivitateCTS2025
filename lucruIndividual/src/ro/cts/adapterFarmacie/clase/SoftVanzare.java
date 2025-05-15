package ro.cts.adapterFarmacie.clase;

public class SoftVanzare {
    private int idMedicament;
    private String numeMedicament;
    private int stoc;

    public SoftVanzare(int idMedicament, String numeMedicament, int stoc) {
        this.idMedicament = idMedicament;
        this.numeMedicament = numeMedicament;
        this.stoc = stoc;
    }

    public int getIdMedicament() {
        return idMedicament;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public int getStoc() {
        return stoc;
    }

    public void setareMedicament(int idMedicament){
        this.idMedicament=idMedicament;
    }
    public boolean verificareDisponibilitate(int medicamenteDorite){
        if(stoc-medicamenteDorite>=0){
            return true;
        } else return false;
    }
}
