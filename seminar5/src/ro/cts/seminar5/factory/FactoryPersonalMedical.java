package ro.cts.seminar5.factory;

import ro.cts.seminar5.claseFactoryMethod.Angajat;
import ro.cts.seminar5.claseFactoryMethod.Asistent;
import ro.cts.seminar5.claseFactoryMethod.Medic;

import static ro.cts.seminar5.factory.TipPersonalMedical.ASISTENT;
import static ro.cts.seminar5.factory.TipPersonalMedical.MEDIC;

public class FactoryPersonalMedical implements FactoryPersonal{
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch((TipPersonalMedical) tipPersonal){
            case ASISTENT->
                new Asistent(nume, salariu, spor);
            case MEDIC->
                new Medic(nume, salariu, spor);
        };
    }
}
