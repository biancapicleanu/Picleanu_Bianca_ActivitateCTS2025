package ro.cts.decoratorSpital.main;

import ro.cts.decoratorSpital.clase.IRezultat;
import ro.cts.decoratorSpital.clase.Rezultat;
import ro.cts.decoratorSpital.clase.RezultatPlatforma;

public class Main {
    public static void main(String[] args) {
        IRezultat rezultat=new Rezultat("Glicemie",100);
        IRezultat rezultatPlatforma=new RezultatPlatforma(rezultat);
        rezultatPlatforma.afisareRezultat();
    }
}
