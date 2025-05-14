package ro.cts.seminar9.strategy.clase;

public class CardBancar implements IMetodaPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(sold>=pretBilet){
            System.out.println("Ai platit cu cardul bancar");
            sold-=pretBilet;
        } else {
            System.out.println("Sold insuficient");
        }
    }
}
