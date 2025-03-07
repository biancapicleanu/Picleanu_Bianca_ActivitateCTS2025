package ro.cts.seminar2.readere;

import ro.cts.seminar2.clase.Angajat;
import ro.cts.seminar2.clase.Aplicant;
import ro.cts.seminar2.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader{
    public StudentiReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
           //to do
            Student aplicant=new Student();
            super.readAplicantData(input, aplicant);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            aplicant.setAnStudii(an_studii);
            aplicant.setFacultate(facultate);
            studenti.add(aplicant);

        }
        input.close();
        return studenti;
    }
}
