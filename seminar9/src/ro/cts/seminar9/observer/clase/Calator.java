package ro.cts.seminar9.observer.clase;

public class Calator implements Observer{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume+" a primit mesajul: "+mesaj);
    }
}
