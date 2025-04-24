package ro.cts.seminar7.facade.main;

import ro.cts.seminar7.facade.clase.Facade;
import ro.cts.seminar7.facade.clase.Masa;
import ro.cts.seminar7.facade.clase.Ospatar;
import ro.cts.seminar7.facade.clase.Picolo;

public class Main {
    public static void main(String[] args) {
        Masa masa =new Masa(4,true);
        Facade facade=new Facade();
        System.out.println(facade.verificaAsezareMasa(masa));

        Masa masa1=new Masa(3, true);
        System.out.println(facade.verificaAsezareMasa(masa1));
        Masa masa2=new Masa(5, false);
        System.out.println(facade.verificaAsezareMasa(masa2));
    }
}
