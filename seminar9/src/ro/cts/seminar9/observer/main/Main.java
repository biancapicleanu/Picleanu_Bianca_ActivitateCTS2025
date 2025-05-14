package ro.cts.seminar9.observer.main;

import ro.cts.seminar9.observer.clase.Autobuz;
import ro.cts.seminar9.observer.clase.Calator;
import ro.cts.seminar9.observer.clase.MijlocDeTransport;
import ro.cts.seminar9.observer.clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1=new Calator("Mihai");
        Observer calator2=new Calator("Ioana");
        Observer calator3=new Calator("Daria");
        MijlocDeTransport autobuz=new Autobuz(100);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator1);
        autobuz.pleacaDeLaCapat();
        ((Autobuz)autobuz).schimbaTraseu();
    }
}
