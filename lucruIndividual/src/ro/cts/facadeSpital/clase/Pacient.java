package ro.cts.facadeSpital.clase;

public class Pacient {
    private String nume;
    private boolean areStareGrava;

    public Pacient(String nume, boolean areStareGrava) {
        this.nume = nume;
        this.areStareGrava = areStareGrava;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isAreStareGrava() {
        return areStareGrava;
    }

    public void setAreStareGrava(boolean areStareGrava) {
        this.areStareGrava = areStareGrava;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", areStareGrava=").append(areStareGrava);
        sb.append('}');
        return sb.toString();
    }
}
