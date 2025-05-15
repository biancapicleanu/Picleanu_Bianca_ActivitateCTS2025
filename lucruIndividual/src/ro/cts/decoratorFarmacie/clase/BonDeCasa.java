package ro.cts.decoratorFarmacie.clase;

public class BonDeCasa implements IBonDeCasa{
    private float suma;

    public BonDeCasa(float suma) {
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaBon() {
        System.out.println("Aveti de achitat "+suma);
    }
}
