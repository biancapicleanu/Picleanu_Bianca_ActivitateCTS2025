package ro.cts.strategyRestaurant.main;

import ro.cts.strategyRestaurant.clase.Client;
import ro.cts.strategyRestaurant.clase.IMetodaPlata;
import ro.cts.strategyRestaurant.clase.PlataCard;
import ro.cts.strategyRestaurant.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlata=new PlataCard(10);
        Client client=new Client(metodaPlata, "Mircea");
        client.alegeMetodaPlata(15);
        client.setMetodaPlata(new PlataCash(20));
        client.alegeMetodaPlata(10);
    }
}
