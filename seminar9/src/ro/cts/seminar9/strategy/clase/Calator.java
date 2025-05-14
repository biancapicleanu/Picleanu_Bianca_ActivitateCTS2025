package ro.cts.seminar9.strategy.clase;

public class Calator {
    private String nume;
    IMetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.metodaPlata=new CardBancar(10);
    }

    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }
    public void alegeBilet(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }
}
