package ro.cts.adapterFarmacie.clase;

public class Adapter extends SoftVanzare implements ISoftDepozit{

    public Adapter(int idMedicament, String numeMedicament, int stoc) {
        super(idMedicament, numeMedicament, stoc);
    }

    @Override
    public boolean verificaStocPentruMedicament(int id, int medicamenteDorite) {
        return super.verificareDisponibilitate(medicamenteDorite);
    }
}
