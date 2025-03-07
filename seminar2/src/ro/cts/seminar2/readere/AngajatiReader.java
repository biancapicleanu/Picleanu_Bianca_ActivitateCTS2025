package ro.cts.seminar2.readere;

import ro.cts.seminar2.clase.Angajat;
import ro.cts.seminar2.clase.Aplicant;
import ro.cts.seminar2.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.prefs.AbstractPreferences;

public class AngajatiReader extends AplicantReader{
    public AngajatiReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat aplicant=new Angajat();
            super.readAplicantData(input2, aplicant);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            aplicant.setSalariu(salariu);
            aplicant.setOcupatie(ocupatie);
            angajati.add(aplicant);
        }
        input2.close();
        return angajati;
    }
}
