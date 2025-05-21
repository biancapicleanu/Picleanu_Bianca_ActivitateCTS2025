package ro.cts.templateRestaurant.clase;

public abstract class AMasa {
    protected abstract void curatareMasa();
    protected abstract void asezareServetele();
    protected abstract void asezareTacamuri();
    protected  abstract void asezarePersoane();

    public final void procesOcupareMasa(){
        curatareMasa();
        asezareServetele();
        asezareTacamuri();
        asezarePersoane();
    }
}
