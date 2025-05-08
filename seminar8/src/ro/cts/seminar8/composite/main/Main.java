package ro.cts.seminar8.composite.main;

import ro.cts.seminar8.composite.clase.Departament;
import ro.cts.seminar8.composite.clase.IStructura;
import ro.cts.seminar8.composite.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        IStructura departament=new Departament("Chirurgie");
        IStructura departament2=new Departament("Cardiologie");
        IStructura departament3=new Departament("Pediatrie");
        IStructura sectie=new Sectie("sectie 1");
        IStructura sectie2=new Sectie("Sectie 2");
        try{
            departament.adaugaNod(departament2);
            departament.adaugaNod(departament3);
            departament2.adaugaNod(sectie);
            departament2.adaugaNod(sectie2);
            departament.descrieStructura();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
