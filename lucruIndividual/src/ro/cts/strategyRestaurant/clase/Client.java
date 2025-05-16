package ro.cts.strategyRestaurant.clase;

public class Client {
    private IMetodaPlata metodaPlata;
    private String nume;

    public Client(IMetodaPlata metodaPlata, String nume) {
        this.metodaPlata = metodaPlata;
        this.nume = nume;
    }

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata=new PlataCash(10);
    }
    public void setMetodaPlata(IMetodaPlata metodaPlata){
        this.metodaPlata=metodaPlata;
    }

    public void alegeMetodaPlata(float suma){
        metodaPlata.realizeazaPlata(suma);
    }
}
