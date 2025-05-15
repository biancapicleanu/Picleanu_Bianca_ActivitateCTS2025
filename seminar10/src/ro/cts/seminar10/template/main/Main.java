package ro.cts.seminar10.template.main;

import ro.cts.seminar10.template.clase.AMetrou;
import ro.cts.seminar10.template.clase.Metrou;
import ro.cts.seminar10.template.clase.MetrouSpecial;

public class Main {
    public static void main(String[] args) {
        AMetrou metrouNormal=new Metrou(1);
        AMetrou metrouSpecial=new MetrouSpecial();
        metrouNormal.circulaTur();
        metrouNormal.circulaRetur();
        metrouSpecial.circulaTur();
        metrouSpecial.circulaRetur();
    }
}
