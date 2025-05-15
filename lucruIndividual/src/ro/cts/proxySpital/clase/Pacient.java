package ro.cts.proxySpital.clase;

public class Pacient implements IPacient{
    private String nume;
    private boolean areAsigurare;

    public Pacient(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public void setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

    @Override
    public void afisareDatePacient() {
        System.out.println("A fost internat pacientul "+nume);
    }
}
