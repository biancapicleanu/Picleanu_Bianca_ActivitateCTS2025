package ro.cts.adapterRestaurant.clase;

public class AdapterSoft extends SoftBucatarie{
    private SoftBar softBar;
    public AdapterSoft(String preparat, int timpPreparare, float pret) {
        super(preparat, timpPreparare, pret);
    }

    public AdapterSoft(SoftBar softBar) {
        super(softBar.getBautura(), 1, softBar.getPret());
        this.softBar = softBar;
    }
}
