package ro.cts.adapterRestaurantV2.clase;

public class SoftBucatarie implements ISoftBucatarie{
    private String preparat;
    private int timpPreparare;
    private float pret;

    public SoftBucatarie(String preparat, int timpPreparare, float pret) {
        this.preparat = preparat;
        this.timpPreparare = timpPreparare;
        this.pret = pret;
    }

    public String getPreparat() {
        return preparat;
    }

    public void setPreparat(String preparat) {
        this.preparat = preparat;
    }

    public int getTimpPreparare() {
        return timpPreparare;
    }

    public void setTimpPreparare(int timpPreparare) {
        this.timpPreparare = timpPreparare;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void printareComanda(){
        System.out.println("Preparatul "+preparat+" cu timpul de preparare "+timpPreparare+" si pretul de "+pret+" este gata");
    }
}
