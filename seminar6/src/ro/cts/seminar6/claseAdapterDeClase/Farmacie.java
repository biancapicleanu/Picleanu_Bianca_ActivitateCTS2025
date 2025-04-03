package ro.cts.seminar6.claseAdapterDeClase;

import ro.cts.seminar6.claseAdapter.MedicamentFarmacie;

public class Farmacie {
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicamnete(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia "+numeFarmacie+" va ofera medicamentul");
        medicamentFarmacie.cumparaMedicament();
    }
}
