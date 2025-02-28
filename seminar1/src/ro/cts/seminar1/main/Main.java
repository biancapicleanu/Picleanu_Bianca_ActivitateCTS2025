package ro.cts.seminar1.main;

import ro.cts.seminar1.clase.Asistent;
import ro.cts.seminar1.clase.Curs;
import ro.cts.seminar1.clase.Profesor;
import ro.cts.seminar1.clase.Student;
import ro.cts.seminar1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listaStudenti=new ArrayList<>();
        listaStudenti.add(new Student("Maria", 20, 4));
        listaStudenti.add(new Student("Ioana", 22, 3));
        Curs curs = new Curs("CTS", 5, (IPredabil) new Profesor("eduard", 22, 1,6000,0.2f),listaStudenti);
        ((IPredabil)curs.getProfesor()).preda();
        System.out.println(((Profesor)curs.getProfesor()).calculareVenit());
        curs.sustineExamen("17 iunie");
        Asistent asistent=new Asistent("Mihai", 25, 5, 3000);
        curs.setProfesor(asistent);
        curs.sustineExamen("22 iunie");

    }
}
