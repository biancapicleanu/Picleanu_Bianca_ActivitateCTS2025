package ro.cts.seminar5.main;

import ro.cts.seminar5.clase.AbstractBuilder;
import ro.cts.seminar5.clase.Pacient;
import ro.cts.seminar5.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("Mihai");
        Pacient pacient = pacientBuilder.setNumePrieten("Andrei").setAreHalat(true).getPacient();
        System.out.println(pacient.toString());
        //pacient.setNumePacient("Gigel");
        Pacient pacient1=pacientBuilder.setNumePrieten("Insotitor2").setAreMicDejun(true).getPacient();
        System.out.println(pacient.toString());
        System.out.println(pacient1.toString());
    }
}
