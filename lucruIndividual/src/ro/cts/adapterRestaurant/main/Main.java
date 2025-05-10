package ro.cts.adapterRestaurant.main;

import ro.cts.adapterRestaurant.clase.AdapterSoft;
import ro.cts.adapterRestaurant.clase.SoftBar;
import ro.cts.adapterRestaurant.clase.SoftBucatarie;

public class Main {
    public static void printareDetalii(SoftBucatarie softBucatarie){
        System.out.println("Soft-ul are urmatoarele date: ");
        softBucatarie.printareComanda();
    }
    public static void main(String[] args) {
        SoftBucatarie softBucatarie=new SoftBucatarie("Pizza", 10, 25);
        printareDetalii(softBucatarie);
        SoftBar softBar=new SoftBar("Suc", 12);
        printareDetalii(new AdapterSoft(softBar));
    }
}
