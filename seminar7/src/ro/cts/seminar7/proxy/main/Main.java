package ro.cts.seminar7.proxy.main;

import ro.cts.seminar7.proxy.clase.IRezervare;
import ro.cts.seminar7.proxy.clase.ProxyNumeClient;
import ro.cts.seminar7.proxy.clase.ProxyRezervare;
import ro.cts.seminar7.proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare=new Rezervare();
        IRezervare proxyRezervare=new ProxyRezervare(rezervare);
        IRezervare proxyNume=new ProxyNumeClient(rezervare);
        proxyRezervare.realizeazaRezervare("Mihai", 2);
        proxyRezervare.realizeazaRezervare("Radu", 4);
        proxyNume.realizeazaRezervare("Mihai", 2);
        proxyNume.realizeazaRezervare("Radu", 4);
    }
}
