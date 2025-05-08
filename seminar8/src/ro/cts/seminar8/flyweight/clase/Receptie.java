package ro.cts.seminar8.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    private Map<String, IPacientAbstract> pacienti;

    public Receptie() {
        this.pacienti = new HashMap<>();
    }

    public IPacientAbstract getPacient(String nume, String nrTelefon, String adresa){
        if(!pacienti.containsKey(nume)){
            pacienti.put(nume, new Pacient(nume, nrTelefon, adresa));

        }
        return pacienti.get(nume);
    }
    public IPacientAbstract getPacient(String nume) throws Exception {
        if(pacienti.containsKey(nume)){
            return pacienti.get(nume);
        } else {
            throw new Exception("Nu exista pacientul");
        }

    }

}
