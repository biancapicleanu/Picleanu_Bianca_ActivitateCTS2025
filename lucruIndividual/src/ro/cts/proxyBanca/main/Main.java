package ro.cts.proxyBanca.main;

import ro.cts.proxyBanca.clase.Credit;
import ro.cts.proxyBanca.clase.ICredit;
import ro.cts.proxyBanca.clase.ProxyCredit;

public class Main {
    public static void main(String[] args) {
        ICredit credit=new Credit("EUR", "Mihai");
        ICredit proxy=new ProxyCredit(credit);
        proxy.realizareCont("EUR");
        ICredit credit1=new Credit("RON", "Mihai");
        ICredit proxy1=new ProxyCredit(credit1);
        proxy1.realizareCont("RON");

    }
}
