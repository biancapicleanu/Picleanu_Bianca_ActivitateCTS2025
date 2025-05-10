package ro.cts.adapterRestaurant.clase;

public class SoftBar {
    private String bautura;
    private float pret;

    public SoftBar(String bautura, float pret) {
        this.bautura = bautura;
        this.pret = pret;
    }

    public String getBautura() {
        return bautura;
    }

    public void setBautura(String bautura) {
        this.bautura = bautura;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
    public void vindeBautura(){
        System.out.println("Bautura a fost vanduta");
    }
}
