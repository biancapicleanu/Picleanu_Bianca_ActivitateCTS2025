package ro.cts.seminar5.factory;

import ro.cts.seminar5.claseFactoryMethod.Angajat;
import ro.cts.seminar5.claseFactoryMethod.Portar;
import ro.cts.seminar5.claseFactoryMethod.Secretar;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
         switch((TipPersonalNonMedical) tipPersonal){
             case SECRETAR:
                return new Secretar(nume, salariu, vechime);
             case PORTAR: return new Portar(nume, salariu,vechime);
             default:return null;
        }
    }
}
