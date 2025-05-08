package ro.cts.seminar8.flyweight.main;

import ro.cts.seminar8.flyweight.clase.IPacientAbstract;
import ro.cts.seminar8.flyweight.clase.Pacient;
import ro.cts.seminar8.flyweight.clase.Receptie;
import ro.cts.seminar8.flyweight.clase.Spitalizare;

public class Main {
    public static void main(String[] args){
        Receptie receptie=new Receptie();
        receptie.getPacient("Andrei", "12355677", "Str. Tunari");
        receptie.getPacient("Maria", "12355677", "Str. Tunari");
        receptie.getPacient("Ionut", "12355677", "Str. Tunari");
        Spitalizare s1=new Spitalizare(1,3,12);
        Spitalizare s2=new Spitalizare(1,2,10);
        Spitalizare s3=new Spitalizare(1,5,9);
        Spitalizare s4=new Spitalizare(2,6,12);
        try{
            receptie.getPacient("Andrei").afisareInformatii(s2);
            receptie.getPacient("Maria").afisareInformatii(s2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
