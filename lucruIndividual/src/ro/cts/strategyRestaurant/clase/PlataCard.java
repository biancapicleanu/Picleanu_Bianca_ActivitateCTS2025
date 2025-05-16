package ro.cts.strategyRestaurant.clase;

public class PlataCard implements IMetodaPlata{
    private float sold;

    public PlataCard(float sold) {
        this.sold = sold;
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(sold>=suma){
            System.out.println("Tranzactie acceptata");
            sold-=suma;
        } else System.out.println("Fonduri insuficiente");
    }
}
