package ro.cts.facadeSpital.main;

import ro.cts.facadeSpital.clase.Facade;
import ro.cts.facadeSpital.clase.Pacient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1=new Pacient("George", false);
        List<Integer> listaPaturi=new ArrayList<>();
        listaPaturi.add(1);
        listaPaturi.add(2);
        listaPaturi.add(3);
        Pacient pacient=new Pacient("Mihai", true);
        Facade facade=new Facade();
        System.out.println(facade.verificareInternare(pacient));
        System.out.println(facade.verificareInternare(pacient1));

    }
}
