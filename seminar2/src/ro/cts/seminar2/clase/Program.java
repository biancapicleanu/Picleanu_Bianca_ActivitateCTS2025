package ro.cts.seminar2.clase;

import ro.cts.seminar2.readere.AngajatiReader;
import ro.cts.seminar2.readere.AplicantReader;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.List;

public class Program {
	static AplicantReader reader=new AngajatiReader("angajati.txt");
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = reader.readAplicanti();
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
