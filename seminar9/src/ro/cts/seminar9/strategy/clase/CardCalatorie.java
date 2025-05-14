package ro.cts.seminar9.strategy.clase;

public class CardCalatorie implements IMetodaPlata{
    private int calatoriiRamase;

    public CardCalatorie(int calatoriiRamase) {
        this.calatoriiRamase = calatoriiRamase;
    }

    @Override
    public void plateste(float pretBilet) {
        if(calatoriiRamase>0){
            System.out.println("Am platit cu cardul de calatorii");
            calatoriiRamase--;
        } else{
            System.out.println("Ai ramas fara calatorii");
        }

    }
}
