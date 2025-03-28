package ro.cts.seminar5.claseFactoryMethod;

public class Secretar extends Angajat{
    private int vechime;
    public Secretar(String nume, double salariu, int vechime) {
        super(nume, salariu);
        this.vechime=vechime;
    }
    @Override
    public String toString() {
        return super.toString()+" vechime= "+vechime;
    }
}
