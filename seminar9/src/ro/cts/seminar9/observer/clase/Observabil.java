package ro.cts.seminar9.observer.clase;

public interface Observabil {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteMesaj(String mesaj);
}
