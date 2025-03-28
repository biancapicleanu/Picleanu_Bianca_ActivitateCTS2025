package ro.cts.seminar5.mainV2;

import ro.cts.seminar5.BuilderV2.Pacient;
import ro.cts.seminar5.BuilderV2.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder=new PacientBuilder();
        pacientBuilder.setNumeInsotitor("Miruna").setAreMicDejun(true).setAreHalat(true);
        Pacient pacient=pacientBuilder.setNumeInsotitor("Adrian").build("Marian");
        Pacient pacient1=pacientBuilder.build("Irina");
        Pacient pacient2=pacientBuilder.build("Cristina");
        System.out.println(pacient.toString());
        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}
