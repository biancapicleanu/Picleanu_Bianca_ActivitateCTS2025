package ro.cts.seminar5.factory;

import ro.cts.seminar5.claseFactoryMethod.Angajat;

public interface FactoryPersonal {
    Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
