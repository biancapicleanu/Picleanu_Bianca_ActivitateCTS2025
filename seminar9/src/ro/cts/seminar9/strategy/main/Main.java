package ro.cts.seminar9.strategy.main;

import ro.cts.seminar9.strategy.clase.Calator;
import ro.cts.seminar9.strategy.clase.CardCalatorie;
import ro.cts.seminar9.strategy.clase.IMetodaPlata;
import ro.cts.seminar9.strategy.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {

        IMetodaPlata metodaPlata=new CardCalatorie(5);
        Calator calator=new Calator("Maria", metodaPlata);
        calator.alegeBilet(5);
        calator.setMetodaPlata(new PlataSMS());
        calator.alegeBilet(5);
    }
}
