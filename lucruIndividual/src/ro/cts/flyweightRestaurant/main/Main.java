package ro.cts.flyweightRestaurant.main;

import ro.cts.flyweightRestaurant.clase.Masa;
import ro.cts.flyweightRestaurant.clase.Receptie;

public class Main {
    public static void main(String[] args) {
        Receptie receptie=new Receptie();

        Masa masa=new Masa(1,3,"12:00");
        Masa masa2=new Masa(2,4,"19:00");
        Masa masa3=new Masa(3,2,"18:00");
        receptie.getClient("Marian", "marian@yahoo.com", "1234565").afisareDetalii(masa);
        receptie.getClient("Maria", "maria@yahoo.com", "1234565").afisareDetalii(masa2);
        receptie.getClient("Laura", "laura@yahoo.com", "1234565").afisareDetalii(masa3);
        try{
            receptie.getClient("Maria").afisareDetalii(masa);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
