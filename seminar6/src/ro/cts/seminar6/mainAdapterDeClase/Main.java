package ro.cts.seminar6.mainAdapterDeClase;

import ro.cts.seminar6.claseAdapterDeClase.*;

public class Main {

    public static void main(String[] args) {
        Farmacie farmacie=new Farmacie("Catena");
        IMedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie(100, "Paracetamol", true);
        farmacie.vindeMedicamnete(medicamentFarmacie);

        //MedicamentSpital medicamentSpital=new MedicamentSpital(19, "Nurofen");
        AdapterDeClase adapterDeClase=new AdapterDeClase(19, "Nurofen");
        farmacie.vindeMedicamnete(adapterDeClase);

    }
}
