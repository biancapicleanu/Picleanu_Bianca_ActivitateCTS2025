package ro.cts.seminar5.mainFactoryMethod;

import ro.cts.seminar5.claseFactoryMethod.Angajat;
import ro.cts.seminar5.factory.*;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical factoryPersonalMedical=new FactoryPersonalMedical(10.5);
        FactoryPersonalNonMedical factoryPersonalNonMedical=new FactoryPersonalNonMedical(10);

        Angajat medic= factoryPersonalMedical.creareAngajat(TipPersonalMedical.MEDIC, "Mihai", 7000);
        factoryPersonalMedical.setSpor(100);
        System.out.println(medic.toString());

        Angajat portar= factoryPersonalNonMedical.creareAngajat(TipPersonalNonMedical.PORTAR, "Gigel", 3500);
        factoryPersonalNonMedical.setVechime(20);
        System.out.println(portar.toString());

    }
}
