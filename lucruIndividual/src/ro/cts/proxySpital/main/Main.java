package ro.cts.proxySpital.main;

import ro.cts.proxySpital.clase.IPacient;
import ro.cts.proxySpital.clase.Pacient;
import ro.cts.proxySpital.clase.ProxyPacient;

public class Main {
    public static void main(String[] args) {
        IPacient pacient=new Pacient("Mihai", true);
        IPacient proxy=new ProxyPacient(pacient);
        proxy.afisareDatePacient();
        IPacient pacient1=new Pacient("Andrei",false);
        IPacient proxy1=new ProxyPacient(pacient1);
        proxy1.afisareDatePacient();
    }
}
