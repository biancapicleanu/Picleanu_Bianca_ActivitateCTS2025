package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    protected int varsta;

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    public abstract float calculareVenit();

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Persoana() {
        nume="";
        varsta=0;
    }
}
