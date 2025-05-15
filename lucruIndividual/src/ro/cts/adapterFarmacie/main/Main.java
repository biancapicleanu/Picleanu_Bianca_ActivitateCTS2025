package ro.cts.adapterFarmacie.main;

import ro.cts.adapterFarmacie.clase.Adapter;
import ro.cts.adapterFarmacie.clase.ISoftDepozit;
import ro.cts.adapterFarmacie.clase.SoftDepozit;

public class Main {
    public static void afisare(ISoftDepozit softDepozit, int id, int medicamenteDorite){
        System.out.println("Rezultatul cererii de medicamente este ");
        System.out.println(softDepozit.verificaStocPentruMedicament(id, medicamenteDorite));

    }
    public static void main(String[] args) {
        ISoftDepozit softDepozit=new SoftDepozit(10, 200);
        afisare(softDepozit,10, 205);
        Adapter adapter=new Adapter(20, "Nurofen", 20);
        afisare(adapter,20,15);
    }
}
