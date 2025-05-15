package ro.cts.adapterFarmacie.clase;

public class SoftDepozit implements ISoftDepozit{
    private int idMedicament;
    private int stoc;

    public SoftDepozit(int idMedicament, int stoc) {
        this.idMedicament = idMedicament;
        this.stoc = stoc;
    }

    public int getIdMedicament() {
        return idMedicament;
    }

    public int getStoc() {
        return stoc;
    }

    @Override
    public boolean verificaStocPentruMedicament(int id, int numarMedicamente) {
        return idMedicament == id && stoc - numarMedicamente >= 0;
    }
}
