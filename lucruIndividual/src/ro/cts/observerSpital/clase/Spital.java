package ro.cts.observerSpital.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Observabil{
    private List<Observer> listaPacienti;

    public Spital() {
        this.listaPacienti = new ArrayList<>();
    }

    @Override
    public void abonareObservator(Observer observer) {
        listaPacienti.add(observer);
    }

    @Override
    public void dezabonareObservator(Observer observer) {
        listaPacienti.remove(observer);
    }

    @Override
    public void notificaObservator(String mesaj) {
        for(Observer observer:listaPacienti){
            observer.primesteMesaj(mesaj);
        }
    }

    public void notificareVirusi(){
        notificaObservator("Atentie! Virus detectat!");
    }
}
