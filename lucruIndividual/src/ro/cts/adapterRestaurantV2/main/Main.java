package ro.cts.adapterRestaurantV2.main;

import ro.cts.adapterRestaurantV2.clase.AdapterSoft;
import ro.cts.adapterRestaurantV2.clase.ISoftBucatarie;
import ro.cts.adapterRestaurantV2.clase.SoftBucatarie;

public class Main {
    public static void printareDetalii(ISoftBucatarie softBucatarie){
        System.out.println("Soft-ul are urmatoarele date: ");
        softBucatarie.printareComanda();
    }
    public static void main(String[] args) {
        ISoftBucatarie softBucatarie=new SoftBucatarie("Supa", 20,20);
        printareDetalii(softBucatarie);
        AdapterSoft adapterSoft=new AdapterSoft("Coca-Cola", 12);
        printareDetalii(adapterSoft);
    }
}
