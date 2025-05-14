package ro.cts.seminar9.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport implements Observabil{
    private int numarLinie;
    private List<Observer> listaObserver;
    public MijlocDeTransport(int numarLinie) {
        this.numarLinie = numarLinie;
        listaObserver=new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        listaObserver.add(observer);
    }

    public List<Observer> getListaObserver() {
        return listaObserver;
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    @Override
    public void stergeObserver(Observer observer) {
        listaObserver.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer observer:listaObserver){
            observer.primesteMesaj(mesaj);
        }
    }
    public abstract void pleacaDeLaCapat();
}
