package ro.cts.decoratorSpital.clase;

public class Rezultat implements IRezultat{
    private String analiza;
    private float valoriAnaliza;

    public Rezultat(String analiza, float valoriAnaliza) {
        this.analiza = analiza;
        this.valoriAnaliza = valoriAnaliza;
    }

    public String getAnaliza() {
        return analiza;
    }

    public void setAnaliza(String analiza) {
        this.analiza = analiza;
    }

    public float getValoriAnaliza() {
        return valoriAnaliza;
    }

    public void setValoriAnaliza(float valoriAnaliza) {
        this.valoriAnaliza = valoriAnaliza;
    }

    @Override
    public void afisareRezultat() {
        System.out.println("Pentru analiza "+analiza+" avem rezultatul "+valoriAnaliza);
    }
}
