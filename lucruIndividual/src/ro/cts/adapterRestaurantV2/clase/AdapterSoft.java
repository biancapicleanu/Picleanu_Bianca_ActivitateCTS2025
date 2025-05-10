package ro.cts.adapterRestaurantV2.clase;

public class AdapterSoft extends SoftBar implements ISoftBucatarie{
    public AdapterSoft(String bautura, float pret) {
        super(bautura, pret);
    }

    @Override
    public void printareComanda() {
        super.vindeBautura();
    }
}
