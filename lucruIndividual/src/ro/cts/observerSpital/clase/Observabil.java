package ro.cts.observerSpital.clase;

public interface Observabil {
    void abonareObservator(Observer observer);
    void dezabonareObservator(Observer observer);
    void notificaObservator(String mesaj);
}
