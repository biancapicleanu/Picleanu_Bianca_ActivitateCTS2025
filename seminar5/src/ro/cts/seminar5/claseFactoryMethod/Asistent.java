package ro.cts.seminar5.claseFactoryMethod;

public class Asistent extends Angajat{
    private double spor;
    public Asistent(String nume, double salariu, double spor) {
        super(nume, salariu);
        this.spor=spor;
    }

    @Override
    public String toString() {
        return super.toString()+" spor= "+spor;
    }
}
