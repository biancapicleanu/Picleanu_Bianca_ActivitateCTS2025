package ro.cts.seminar6.claseAdapterDeClase;

public class MedicamentFarmacie implements IMedicamentFarmacie{
    private float pret;
    private String nume;
    private boolean esteInStoc;

    public MedicamentFarmacie(float pret, String nume, boolean esteInStoc) {
        this.pret = pret;
        this.nume = nume;
        this.esteInStoc = esteInStoc;
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEsteInStoc() {
        return esteInStoc;
    }
    public void cumparaMedicament(){
        if(esteInStoc){
            System.out.println("Medicamentul "+nume+" este in stoc si poate fi cumparat la pretul de "+pret);
        } else {
            System.out.println("Medicamentul cerut nu este in stoc");
        }
    }
}
