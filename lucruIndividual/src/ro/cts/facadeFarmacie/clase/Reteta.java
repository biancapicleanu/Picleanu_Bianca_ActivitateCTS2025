package ro.cts.facadeFarmacie.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private String nume;
    private List<Reteta> retete;

    public Reteta(String nume) {
        this.nume = nume;
        this.retete = new ArrayList<>();
    }


    public boolean verificaReteta(Reteta reteta){
        return retete.contains(reteta);
    }
}
