package ro.cts.seminar5.claseFactoryMethod;

public class Portar extends Angajat{
    private int vechime;
    public Portar(String nume, double salariu, int vechime) {
        super(nume, salariu);
        this.vechime=vechime;
    }
    @Override
    public String toString() {
        return super.toString()+" vechime= "+vechime;
    }
}
