package ro.cts.facadeFarmacie.main;

import ro.cts.facadeFarmacie.clase.CardSanatate;
import ro.cts.facadeFarmacie.clase.DepozitMedicamente;
import ro.cts.facadeFarmacie.clase.Facade;
import ro.cts.facadeFarmacie.clase.Reteta;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Reteta> retete=new ArrayList<>();
        retete.add(new Reteta("Reteta 1"));
        retete.add(new Reteta("Reteta 2"));
        retete.add(new Reteta("Reteta 3"));
        List<String> medicamente=new ArrayList<>();
        medicamente.add("Nurofen");
        medicamente.add("Paracetamol");
        medicamente.add("Aspirina");
        Reteta reteta=new Reteta("Reteta 1");
        Facade facade=new Facade();
        System.out.println(facade.verificare(reteta,retete,"Nurofen",medicamente));


    }
}
