package ro.cts.observerSpital.main;

import ro.cts.observerSpital.clase.Observabil;
import ro.cts.observerSpital.clase.Observer;
import ro.cts.observerSpital.clase.Pacient;
import ro.cts.observerSpital.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Observer pacient=new Pacient("Laura");
        Observabil spital=new Spital();
        spital.abonareObservator(pacient);
        spital.notificaObservator("Atentie! Virus detectat!");
        ((Spital)spital).notificareVirusi();
    }
}
