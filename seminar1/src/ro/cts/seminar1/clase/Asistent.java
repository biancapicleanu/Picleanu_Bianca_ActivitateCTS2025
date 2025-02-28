package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private int idAsistent;
    private float salariu;

    public int getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    public Asistent(String nume, int varsta, int idAsistent, float salariu) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.salariu = salariu;
    }

    public Asistent() {
        super("Numeasistent", 24);
        this.idAsistent = 0;
        this.salariu=0;
    }

    @Override
    public void preda() {

    }

    @Override
    public float calculareVenit() {
        return salariu;
    }
}
